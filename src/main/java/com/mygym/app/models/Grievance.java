package com.mygym.app.models;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "grievances")
public class Grievance {

	@Id
	@MongoId(targetType = FieldType.OBJECT_ID)
	private ObjectId _id;
	
    private String grievanceId;

    private String branchId;
    
    private String memberId;

    private String date;
    
    private String title;

    private String issueType;

    private String description;

    private String resolution;

    private String closureDate;

    public Grievance() {}

    public Grievance(ObjectId _id, String grievanceId, String branchId, String memberId, String title, String date, String issueType, String description, String resolution, String closureDate) {
    	this._id = _id;
    	this.grievanceId = grievanceId;
        this.branchId = branchId;
        this.memberId = memberId;
        this.title = title;
        this.date = date;
        this.issueType = issueType;
        this.description = description;
        this.resolution = resolution;
        this.closureDate = closureDate;
    }

    public ObjectId get_id() { return _id; }
	public void set_id(ObjectId _id) { this._id = _id;	}
    
    public String getGrievanceId() { return grievanceId; }
    public void setGrievanceId(String grievanceId) { this.grievanceId = grievanceId; }

    public String getBranchId() { return branchId; }
    public void setBranchId(String branchId) { this.branchId = branchId; }

    public String getMemberId() { return memberId;	}
	public void setMemberId(String memberId) { this.memberId = memberId; }

	public String getTitle() { return title; }
	public void setTitle(String title) { this.title = title;}

	public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

    public String getIssueType() { return issueType; }
    public void setIssueType(String issueType) { this.issueType = issueType; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public String getResolution() { return resolution; }
    public void setResolution(String resolution) { this.resolution = resolution; }

    public String getClosureDate() { return closureDate; }
    public void setClosureDate(String closureDate) { this.closureDate = closureDate; }
}
