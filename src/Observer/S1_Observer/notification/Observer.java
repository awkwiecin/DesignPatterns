package Observer.S1_Observer.notification;

import Observer.S1_Observer.order.Order;

public interface Observer {
    void update(Order order);

}
