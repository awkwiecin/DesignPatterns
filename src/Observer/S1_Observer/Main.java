package Observer.S1_Observer;

import Observer.S1_Observer.notification.Email;
import Observer.S1_Observer.notification.MobileApp;
import Observer.S1_Observer.notification.TextMessage;
import Observer.S1_Observer.order.Order;
import Observer.S1_Observer.order.OrderStatus;

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
