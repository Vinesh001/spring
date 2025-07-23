package com.example.pratice;

public class Customer {
    private String customerName;
    private String customerId;
    private String customerEmail;

    public void setCustomerName(String name) {
        this.customerName = name;
    }

    public void setCustomerId(String id) {
        this.customerId = id;
    }

    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                ", customerId='" + customerId + '\'' +
                ", customerEmail='" + customerEmail + '\'' +
                '}';
    }
}
