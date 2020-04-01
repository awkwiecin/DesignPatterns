package Observer.Observer_Lesson;

import Observer.Observer_Lesson.notification.Email;
import Observer.Observer_Lesson.notification.MobileApp;
import Observer.Observer_Lesson.notification.TextMessage;
import Observer.Observer_Lesson.order.Order;
import Observer.Observer_Lesson.order.OrderStatus;

public class Main {

    public static void main(String[] args) {


        Order order = new Order(110L, OrderStatus.ZAREJESTROWANE);

        TextMessage textMessage = new TextMessage();
        MobileApp mobileApp = new MobileApp();
        Email email = new Email();

        order.registerObserver(textMessage);
        order.registerObserver(mobileApp);
        order.registerObserver(email);

        order.notifiyObserver();

        System.out.println("-----------------------------------");

        order.changeStatus(OrderStatus.WYSŁANE);

        order.unregisterObserver(email);

        System.out.println("-----------------------------------");

        order.changeStatus(OrderStatus.ODEBRANE);


    }
}
