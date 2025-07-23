package com.example.pratice;

public class Payment{
    private String paymentId;
    private double amount;

    Payment(String paymentId, double amount){
        this.paymentId = paymentId;
        this.amount = amount;
    }

    @Override
    public String toString(){
        return "Payment{" +
                "paymentId='" + paymentId + '\'' +
                ", amount=" + amount +
                '}';
    }

}