package com.mygym.app.models;

public class Failure {

	public String reason;
	
	public String updatedByAdmin;
	
	public String updatedFailureDate;
	
	public String estimatedDateOfFix;
	
	public Failure(String reason, String updatedByAdmin, String updatedFailureDate, String estimatedDateOfFix) {
		this.reason = reason;
		this.updatedByAdmin = updatedByAdmin;
		this.updatedFailureDate = updatedFailureDate;
		this.estimatedDateOfFix = estimatedDateOfFix;
	}

	public String getReason() {	return reason; }
	public void setReason(String reason) {this.reason = reason;	}

	public String getUpdatedByAdmin() {	return updatedByAdmin; }
	public void setUpdatedByAdmin(String updatedByAdmin) {this.updatedByAdmin = updatedByAdmin;	}

	public String getUpdatedFailureDate() {	return updatedFailureDate;}
	public void setUpdatedFailureDate(String updatedFailureDate) {this.updatedFailureDate = updatedFailureDate;}

	public String getEstimatedDateOfFix() {	return estimatedDateOfFix;}
	public void setEstimatedDateOfFix(String estimatedDateOfFix) {	this.estimatedDateOfFix = estimatedDateOfFix;	} 
	
	
}
