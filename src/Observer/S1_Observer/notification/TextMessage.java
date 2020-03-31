package S1_Observer.notification;

import S1_Observer.order.Order;

public class TextMessage implements Observer {
    public void update(Order order){
        System.out.println("Text message - Zamówienie nr: "
                + order.getOrderNumber() + " zmieniło status: " + order.getOrderStatus());
    }
}