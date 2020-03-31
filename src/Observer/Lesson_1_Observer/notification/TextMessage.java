package Observer.Lesson_1_Observer.notification;

import Observer.Lesson_1_Observer.order.Order;

public class TextMessage implements Observer {
    public void updateForecast(Order order){
        System.out.println("Text message - Zamówienie nr: "
                + order.getOrderNumber() + " zmieniło status: " + order.getOrderStatus());
    }
}
