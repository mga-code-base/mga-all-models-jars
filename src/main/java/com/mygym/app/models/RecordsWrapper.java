package com.mygym.app.models;

import java.util.List;

public class RecordsWrapper {

	private List<Member> allMembers;
	
	public RecordsWrapper() {}
	public RecordsWrapper(List<Member> allMembers) { this.allMembers = allMembers; }

	public List<Member> getAllMembers() { return allMembers; }
	public void setAllMembers(List<Member> allMembers) { this.allMembers = allMembers;}
}
