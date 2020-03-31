package S1_Observer;

import S1_Observer.notification.Email;
import S1_Observer.notification.MobileApp;
import S1_Observer.notification.TextMessage;
import S1_Observer.order.Order;
import S1_Observer.order.OrderStatus;

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
