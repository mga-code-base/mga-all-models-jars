package com.mygym.app.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "trainers")
public class Trainer {
	
	@Id
	@MongoId(targetType = FieldType.OBJECT_ID)
	private ObjectId _id;

    private String trainerId;

    private String name;

    private String username;

    private String password;

    private Long mobileNumber;

    private String emailAddress;

    private Boolean isActive = false;
    
    private String branchId;

    private List<String> activeClientIds;

    public Trainer() {}
    public Trainer(String invalidId) {
    	this.trainerId = invalidId;
    }
    public Trainer(String trainerId, String name, String username, String password, Long mobileNumber, String emailAddress, Boolean isActive, String branchId, List<String> activeClientIds) {
        this.trainerId = trainerId;
        this.name = name;
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        this.isActive = isActive;
        this.activeClientIds = activeClientIds;
        this.setBranchId(branchId);
    }
    
    public String getTrainerId() { return trainerId; }
    public void setTrainerId(String trainerId) { this.trainerId = trainerId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public Long getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(Long mobileNumber) { this.mobileNumber = mobileNumber; }

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

    public String getBranchId() { return branchId;}
	public void setBranchId(String branchId) { this.branchId = branchId; }

	public List<String> getActiveClients() { return activeClientIds; }
    public void setActiveClients(List<String> activeClientIds) { this.activeClientIds = activeClientIds; }
}
