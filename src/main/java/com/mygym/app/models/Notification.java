package com.mygym.app.models;

import java.io.Serializable;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import com.mygym.app.validation.OnCreate;

@Document(collection = "notifications")
public record Notification(
        @Indexed(unique = true, sparse = true) String notificationId,
        String messageType,
        @NotBlank(groups = OnCreate.class) @Size(max = 2000) String message,
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
