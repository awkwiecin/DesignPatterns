package S1_Observer.notification;

import S1_Observer.order.Order;

public class Email implements Observer {
    public void update(Order order){
        System.out.println("Email - Zamówienie nr: "
                + order.getOrderNumber() + " zmieniło status: " + order.getOrderStatus());

}
}
