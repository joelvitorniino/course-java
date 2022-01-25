package exercise_1.entities;

import exercise_1.entities.enums.OrderStatus;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private Date moment;
    private OrderStatus status;

    private List<OrderItem> list = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status) {
        this.moment = moment;
        this.status = status;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public List<OrderItem> getList() {
        return list;
    }

    public void addItem(OrderItem item) {
        list.add(item);
    }

    public void removeItem(OrderItem item) {
        list.remove(item);
    }
}
