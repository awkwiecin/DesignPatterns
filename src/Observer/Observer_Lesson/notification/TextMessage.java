package Observer.Observer_Lesson.notification;

import Observer.Observer_Lesson.order.Order;

public class TextMessage implements Observer {
    public void update(Order order){
        System.out.println("Text message - Zamówienie nr: "
                + order.getOrderNumber() + " zmieniło status: " + order.getOrderStatus());
    }
}
