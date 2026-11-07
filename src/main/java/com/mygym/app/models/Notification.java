package com.mygym.app.models;

import java.io.Serializable;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notifications")
public record Notification(
        String notificationId,
        String messageType,
        String message,
        String image,
        String generatingAdmin,
        Boolean publishStatusCheck) implements Serializable {

    public Notification withNotificationId(String notificationId) {
        return new Notification(notificationId, messageType, message, image, generatingAdmin, publishStatusCheck);
    }

    public Notification withPublishStatusCheck(Boolean publishStatusCheck) {
        return new Notification(notificationId, messageType, message, image, generatingAdmin, publishStatusCheck);
    }
}
