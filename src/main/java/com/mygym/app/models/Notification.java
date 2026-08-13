package com.mygym.app.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "notifications")
public class Notification {

    private String notificationId;

    private String messageType;

    private String message;

    private String image;

    private String generatingAdmin;
    
    private Boolean publishStatusCheck;

    public Notification() {}

    public Notification(String notificationId, String messageType, String message, String image, String generatingAdmin, Boolean publishStatusCheck) {
        this.notificationId = notificationId;
        this.messageType = messageType;
        this.message = message;
        this.image = image;
        this.generatingAdmin = generatingAdmin;
    }

    public String getNotificationId() { return notificationId; }
    public void setNotificationId(String notificationId) { this.notificationId = notificationId; }

    public String getMessageType() { return messageType; }
    public void setMessageType(String messageType) { this.messageType = messageType; }

    public String getMessage() { return message; }
    public void setMessage(String message) { this.message = message; }

    public String getImage() { return image; }
    public void setImage(String image) { this.image = image; }

    public String getGeneratingAdmin() { return generatingAdmin; }
    public void setGeneratingAdmin(String generatingAdmin) { this.generatingAdmin = generatingAdmin; }

	public Boolean getPublishStatusCheck() {return publishStatusCheck;}
	public void setPublishStatusCheck(Boolean publishStatusCheck) {	this.publishStatusCheck = publishStatusCheck;}
}
