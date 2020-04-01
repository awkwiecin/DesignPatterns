package Observer.Observer_Lesson.notification;

import Observer.Observer_Lesson.order.Order;

public class Email implements Observer {
    public void update(Order order){
        System.out.println("Email - Zamówienie nr: "
                + order.getOrderNumber() + " zmieniło status: " + order.getOrderStatus());

}
}
