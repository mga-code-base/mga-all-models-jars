package com.mygym.app.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.FieldType;
import org.springframework.data.mongodb.core.mapping.MongoId;

import com.fasterxml.jackson.annotation.JsonProperty;

@Document(collection = "_exercise")
public class ExcerciseList {

	@Id
	@MongoId(targetType = FieldType.OBJECT_ID)
    private String internalOid;

    @Field("id")
    private String customId;

    @JsonProperty("Chest")
    @Field("Chest")
    private List<String> chestExercises;
    
    @JsonProperty("Shoulder")
    @Field("Shoulder")
    private List<String> shoulderExercises;

    @JsonProperty("Back")
    @Field("Back")
    private List<String> backExercises;
    
    @JsonProperty("Biceps")
    @Field("Biceps")
    private List<String> bicepsExercises;
    
    @JsonProperty("Triceps")
    @Field("Triceps")
    private List<String> tricepsExercises;
    
    @JsonProperty("Legs")
    @Field("Legs")
    private List<String> legsExercises;
    
    @JsonProperty("Abs")
    @Field("Abs")
    private List<String> absExercises;
    
    @JsonProperty("Cardio")
    @Field("Cardio")
    private List<String> cardioExercises;

	public ExcerciseList(List<String> chestExercises, List<String> shoulderExercises, List<String> backExercises,
			List<String> bicepsExercises, List<String> tricepsExercises, List<String> legsExercises,
			List<String> absExercises, List<String> cardioExercises) {
		this.chestExercises = chestExercises;
		this.shoulderExercises = shoulderExercises;
		this.backExercises = backExercises;
		this.bicepsExercises = bicepsExercises;
		this.tricepsExercises = tricepsExercises;
		this.legsExercises = legsExercises;
		this.absExercises = absExercises;
		this.cardioExercises = cardioExercises;
	}

	public ExcerciseList() {}

	public List<String> getChestExercises() {return chestExercises;	}
	public void setChestExercises(List<String> chestExercises) {this.chestExercises = chestExercises;}

	public List<String> getShoulderExercises() {return shoulderExercises;}
	public void setShoulderExercises(List<String> shoulderExercises) {this.shoulderExercises = shoulderExercises;	}

	public List<String> getBackExercises() {return backExercises;}
	public void setBackExercises(List<String> backExercises) {this.backExercises = backExercises;}

	public List<String> getBicepsExercises() {return bicepsExercises;	}
	public void setBicepsExercises(List<String> bicepsExercises) {this.bicepsExercises = bicepsExercises;}

	public List<String> getTricepsExercises() {	return tricepsExercises;}
	public void setTricepsExercises(List<String> tricepsExercises) { this.tricepsExercises = tricepsExercises;}

	public List<String> getLegsExercises() { return legsExercises;	}
	public void setLegsExercises(List<String> legsExercises) { this.legsExercises = legsExercises;}

	public List<String> getAbsExercises() {	return absExercises; }
	public void setAbsExercises(List<String> absExercises) { this.absExercises = absExercises; }

	public List<String> getCardioExercises() { return cardioExercises; }
	public void setCardioExercises(List<String> cardioExercises) { this.cardioExercises = cardioExercises; }
}
