package com.mygym.app.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "admins")
public class Admin {
	
	@Id
	@MongoId(targetType = FieldType.OBJECT_ID)
	private ObjectId _id;

    private String adminId;

    private String name;

    private String username;

    private String password;

    private String mobileNumber;

    private String emailAddress;

    private Boolean isActive = false;
    
    private String branchId;

    public Admin() {}
    public Admin(String adminId, String username, String password, String mobileNumber, String emailAddress) {
        this.adminId = adminId;
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
    }
    public Admin(String adminId, String name, String username, String password, String mobileNumber, String emailAddress, List<Member> potentialMembers, Boolean isActive, String branchId) {
        this.adminId = adminId;
        this.name = name;
        this.username = username;
        this.password = password;
        this.mobileNumber = mobileNumber;
        this.emailAddress = emailAddress;
        this.isActive = isActive;
        this.branchId = branchId;
    }
    public Admin(String invalidInt) {
		this.adminId = invalidInt;
	}

	public ObjectId get_id() { return _id; }
	public void set_id(ObjectId _id) { this._id = _id; }

    public String getAdminId() { return adminId; }
    public void setAdminId(String adminId) { this.adminId = adminId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getUsername() { return username; }
    public void setUsername(String username) { this.username = username; }

    public String getPassword() { return password; }
    public void setPassword(String password) { this.password = password; }

    public String getMobileNumber() { return mobileNumber; }
    public void setMobileNumber(String mobileNumber) { this.mobileNumber = mobileNumber; }

    public String getEmailAddress() { return emailAddress; }
    public void setEmailAddress(String emailAddress) { this.emailAddress = emailAddress; }

    public Boolean getIsActive() { return isActive; }
    public void setIsActive(Boolean isActive) { this.isActive = isActive; }

	public String getBranch() {	return branchId; }
	public void setBranch(String branchId) { this.branchId = branchId;	}
}
