package S1_Observer.notification;

import S1_Observer.order.Order;

public class Email {
    public void updateOrderStatus(Order order){
        System.out.println("Email - Zamówienie nr: "
                + order.getOrderNumber() + " zmieniło status: " + order.getOrderStatus());

}
}
