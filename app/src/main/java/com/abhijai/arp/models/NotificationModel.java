package com.abhijai.arp.models;

public class NotificationModel {
    private String notificationMessage;
    private String notificationDate;

    public NotificationModel(String notificationMessage, String notificationDate) {
        this.notificationMessage = notificationMessage;
        this.notificationDate = notificationDate;
    }

    public String getNotificationMessage() {
        return notificationMessage;
    }

    public void setNotificationMessage(String notificationMessage) {
        this.notificationMessage = notificationMessage;
    }

    public String getNotificationDate() {
        return notificationDate;
    }

    public void setNotificationDate(String notificationDate) {
        this.notificationDate = notificationDate;
    }
}
