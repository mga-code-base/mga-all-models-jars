package com.mygym.app.models;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Document(collection = "records")
public class MyRecord {
	
	@Id
	@MongoId(targetType = FieldType.OBJECT_ID)
	private ObjectId _id;
	
	private String memberId;

    private String exerciseName;

    private String targetMuscle;
    
    private List<Set> sets;

    private String date;

    public MyRecord() {}

    public MyRecord(ObjectId _id, String memberId, String exerciseName, String targetMuscle, List<Set> sets, String date) {
    	this.memberId = memberId;
    	this.exerciseName = exerciseName;
        this.targetMuscle = targetMuscle;
        this.sets = sets;
        this.date = date;
    }
    
    public ObjectId get_id() { return _id; }
	public void set_id(ObjectId _id) { this._id = _id;	}

    public String getExerciseName() { return exerciseName; }
    public void setExerciseName(String exerciseName) { this.exerciseName = exerciseName; }

    public String getTargetMuscle() { return targetMuscle; }
    public void setTargetMuscle(String targetMuscle) { this.targetMuscle = targetMuscle; }

    public List<Set> getSets() { return sets; }
	public void setSets(List<Set> sets) { this.sets = sets;	}

	public String getDate() { return date; }
    public void setDate(String date) { this.date = date; }

	public String getMemberId() { return memberId; }
	public void setMemberId(String memberId) { this.memberId = memberId; }
}
