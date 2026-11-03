package com.mygym.app.models;

import java.io.Serial;
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

    @Serial
    private static final long serialVersionUID = 1L;

    public Notification withNotificationId(String notificationId) {
        return new Notification(notificationId, messageType, message, image, generatingAdmin, publishStatusCheck);
    }

    public Notification withPublishStatusCheck(Boolean publishStatusCheck) {
        return new Notification(notificationId, messageType, message, image, generatingAdmin, publishStatusCheck);
    }
}
