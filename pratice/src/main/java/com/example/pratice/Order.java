package com.example.pratice;

public class Order {
    private String orderId;
    private String orderDate;
    private double orderAmount;

    private Payment payment;             
    private Notification notification;   
    private Customer customer;          

    public Order(String orderId, String orderDate, double orderAmount, Payment payment) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.orderAmount = orderAmount;
        this.payment = payment;
    }

    public void setNotification(Notification notification) {
        this.notification = notification;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId='" + orderId + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderAmount=" + orderAmount +
                ", payment=" + payment +
                ", notification=" + notification +
                ", customer=" + customer +
                '}';
    }
}
