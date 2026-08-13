package com.mygym.app.models;

import java.util.List;

public class TrainerWrapper {

	private List<Trainer> allTrainers;

	public TrainerWrapper() {}
	public TrainerWrapper(List<Trainer> allTrainers) {this.allTrainers = allTrainers;}

	public List<Trainer> getAllTrainers() {	return allTrainers;	}
	public void setAllTrainers(List<Trainer> allTrainers) {	this.allTrainers = allTrainers;	}
}
