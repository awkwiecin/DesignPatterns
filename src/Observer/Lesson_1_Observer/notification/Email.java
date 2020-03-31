package Observer.Lesson_1_Observer.notification;

import Observer.Lesson_1_Observer.order.Order;

public class Email implements Observer {
    public void updateForecast(Order order){
        System.out.println("Email - Zamówienie nr: "
                + order.getOrderNumber() + " zmieniło status: " + order.getOrderStatus());

}
}
