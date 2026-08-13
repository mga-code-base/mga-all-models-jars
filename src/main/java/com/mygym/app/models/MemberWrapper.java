package com.mygym.app.models;

import java.util.List;

public class MemberWrapper {

	private List<Member> allMembers;

	public MemberWrapper() {}
	public MemberWrapper(List<Member> allMembers) {	this.allMembers = allMembers;}

	public List<Member> getAllMembers() {return allMembers;	}
	public void setAllMembers(List<Member> allMembers) {this.allMembers = allMembers;}
}
