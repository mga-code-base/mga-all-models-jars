package com.mygym.app.models;

import java.util.List;

public class TargetMuscleWrapper {

	private List<String> allExcercises;
	
	public TargetMuscleWrapper(List<String> allExcercises) {this.allExcercises = allExcercises;	}

	public List<String> getAllExcercises() {return allExcercises;}
	public void setAllExcercises(List<String> allExcercises) {this.allExcercises = allExcercises;}
}
