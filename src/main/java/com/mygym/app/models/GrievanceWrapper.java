package com.mygym.app.models;

import java.util.List;

public class GrievanceWrapper {
	
	private List<Grievance> allGrievances;
	
	public GrievanceWrapper() {	}

	public GrievanceWrapper(List<Grievance> allGrievances) {this.allGrievances = allGrievances;	}

	public List<Grievance> getAllGrievances() {	return allGrievances;}
	public void setAllGrievances(List<Grievance> allGrievances) {this.allGrievances = allGrievances;}
	
	
}
