package com.mygym.app.models;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "equipments")
public class Equipment {

    private Integer equipmentId;

    private String name;
    
    private String targetMuscle;

    private Boolean isInWorkingCondition = true;
    
    private Failure failure;

    public Equipment() {}
    public Equipment(Integer equipmentId, String name, String targetMuscle, Boolean isInWorkingCondition, Failure failure) {
        this.equipmentId = equipmentId;
    	this.name = name;
    	this.targetMuscle = targetMuscle;
        this.isInWorkingCondition = isInWorkingCondition;
        this.failure = failure;
    }

    public Integer getEquipmentId() { return equipmentId; }
    public void setEquipmentId(Integer id) { this.equipmentId = id; }

    public String getTargetMuscle() { return targetMuscle; }
	public void setTargetMuscle(String targetMuscle) { this.targetMuscle = targetMuscle;}
	
	public String getName() { return name; }
    public void setName(String name) { this.name = name; }

	public Boolean getIsInWorkingCondition() { return isInWorkingCondition; }
	public void setIsInWorkingCondition(Boolean isInWorkingCondition) {	this.isInWorkingCondition = isInWorkingCondition; }

	public Failure getFailure() { return failure; }
	public void setFailure(Failure failure) { this.failure = failure; }
}
