package S1_Observer.order;

import S1_Observer.notification.Observer;

import java.util.HashSet;
import java.util.Set;

public class Order implements Observable {

    private long orderNumber;
    private OrderStatus orderStatus;
    private Set<Observer> registerObservers = new HashSet<>();


    public Order(long orderNumber, OrderStatus orderStatus) {
        this.orderNumber = orderNumber;
        this.orderStatus = orderStatus;
    }

    public void registerObserver(Observer observer) {
        registerObservers.add(observer);
    }

    public void unregisterObserver(Observer observer) {
        registerObservers.remove(observer);
    }

    public void notifiyObserver() {
        for(Observer observer : registerObservers){
            observer.update(this);
        }

    }


    public void changeStatus(OrderStatus orderStatus){
        setOrderStatus(orderStatus);
        notifiyObserver();
    }

    public long getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(long orderNumber) {
        this.orderNumber = orderNumber;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }
}
