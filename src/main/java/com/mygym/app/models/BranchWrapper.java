package com.mygym.app.models;

import java.util.List;

public class BranchWrapper {

	private List<Branch> allBranches;
	
	public BranchWrapper(List<Branch> allBranches) {
		this.allBranches = allBranches;
	}

	public List<Branch> getAllBranches() { return allBranches;	}
	public void setAllBranches(List<Branch> allBranches) { this.allBranches = allBranches;	}
}
