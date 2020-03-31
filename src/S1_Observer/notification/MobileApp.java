package S1_Observer.notification;

import S1_Observer.order.Order;

public class MobileApp {

    public void updateOrderStatus(Order order){
        System.out.println("Mobile App - Zamówienie nr: "
                + order.getOrderNumber() + " zmieniło status: " + order.getOrderStatus());

    }
}
