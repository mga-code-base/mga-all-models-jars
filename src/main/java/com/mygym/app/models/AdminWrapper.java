package com.mygym.app.models;

import java.util.List;

public class AdminWrapper {
	
	private List<Admin> allAdmins;
	
	public AdminWrapper(List<Admin> allAdmins) { this.allAdmins = allAdmins; }

	public List<Admin> getAllAdmins() { return allAdmins; }
	public void setAllAdmins(List<Admin> allAdmins) { this.allAdmins = allAdmins; }

}
