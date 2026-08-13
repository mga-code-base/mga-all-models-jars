package com.mygym.app.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "branches")
public class Branch {
	
	@Id
	@MongoId(targetType = FieldType.OBJECT_ID)
	private ObjectId _id;

    private String branchId;

    private String name;

    private List<String> adminIds;

    private Integer pincode;
    
    private String address;
    
    private String city;
    
    private List<Equipment> equipments;
    
    private Boolean isActive = false;

    public Branch() {}
    public Branch(String branchId, String name, List<String> adminIds, Integer pincode, String address, String city, List<Equipment> equipments, Boolean isActive) {
        this.branchId = branchId;
        this.name = name;
        this.adminIds = adminIds;
        this.pincode = pincode;
        this.address = address;
        this.city = city;
        this.equipments = equipments;
        this.isActive = isActive;
    }
    public Branch(String invalidBranchId) {
    	this.branchId = invalidBranchId;
	}

	public ObjectId get_id() { return _id;	}
	public void set_id(ObjectId _id) { this._id = _id;	}

    public String getBranchId() { return branchId; }
    public void setBranchId(String branchId) { this.branchId = branchId; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public List<String> getAdminIds() { return adminIds; }
    public void setAdminIds(List<String> adminIds) { this.adminIds = adminIds; }

    public Integer getPincode() { return pincode; }
    public void setPincode(Integer pincode) {this.pincode = pincode; }
    
    public String getAddress() { return address; }
	public void setAddress(String address) { this.address = address;}

	public String getCity() { return city; }
	public void setCity(String city) { this.city = city; }

	public List<Equipment> getEquipments() { return equipments; }
	public void setEquipments(List<Equipment> allEquipments) { this.equipments = allEquipments; }
	
	public Boolean getIsActive() { return isActive;	}
	public void setIsActive(Boolean isActive) {	this.isActive = isActive;	}
}
