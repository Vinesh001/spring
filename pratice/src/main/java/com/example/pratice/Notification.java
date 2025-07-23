package com.example.pratice;

public class Notification{
    private String notificationMessage;

    public void setNotificationMessage(String notificationMessage){
        this.notificationMessage = notificationMessage;
    }
    
    @Override
    public String toString(){
        return "Notification{" +
                "notificationMessage='" + notificationMessage + '\'' +
                '}';
    }
}