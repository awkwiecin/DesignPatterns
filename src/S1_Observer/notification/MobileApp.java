package S1_Observer.notification;

import S1_Observer.order.Order;

public class MobileApp implements Observer{

    public void update(Order order){
        System.out.println("Mobile App - Zamówienie nr: "
                + order.getOrderNumber() + " zmieniło status: " + order.getOrderStatus());

    }
}
