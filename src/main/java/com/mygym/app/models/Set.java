package com.mygym.app.models;

import java.util.List;

public class Set {
	
    private Float weight;
    
    private String scaleType;

    private Integer reps;
    
    private List<Set> subsets;

	public Set() {}
	public Set(Integer isSubSet, Float weight, String scaleType, Integer reps, List<Set> subsets) {
		this.weight = weight; this.scaleType = scaleType;	this.reps = reps;  this.subsets = subsets;
	}

	public Float getWeight() {return weight;}
	public void setWeight(Float weight) {	this.weight = weight;}

	public String getScaleType() {return scaleType;}
	public void setScaleType(String scaleType) {this.scaleType = scaleType;	}

	public Integer getReps() {return reps;}
	public void setReps(Integer reps) {this.reps = reps;}

	public List<Set> getSubsets() {	return subsets;	}
	public void setSubsets(List<Set> subsets) {	this.subsets = subsets;	}
}
