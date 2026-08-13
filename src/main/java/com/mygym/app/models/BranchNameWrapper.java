package com.mygym.app.models;

import java.util.Map;

public class BranchNameWrapper {

	private Map<String, String> allBrancheNames;
	
	public BranchNameWrapper(Map<String, String> allBrancheNames) {
		this.setAllBrancheNames(allBrancheNames);
	}
	public BranchNameWrapper() {}

	public Map<String, String> getAllBrancheNames() { return allBrancheNames; }
	public void setAllBrancheNames(Map<String, String> allBrancheNames) { this.allBrancheNames = allBrancheNames;}


}
