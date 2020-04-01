package Observer.Observer_Lesson.notification;

import Observer.Observer_Lesson.order.Order;

public class MobileApp implements Observer{

    public void update(Order order){
        System.out.println("Mobile App - Zamówienie nr: "
                + order.getOrderNumber() + " zmieniło status: " + order.getOrderStatus());

    }
}
