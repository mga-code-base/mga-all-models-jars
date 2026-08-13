package com.mygym.app.models;

import java.util.List;

public class MyRecordsWrapper {

	private List<MyRecord> allMyRecords;
	
	public MyRecordsWrapper() {}
	public MyRecordsWrapper(List<MyRecord> allMyRecords) { this.allMyRecords = allMyRecords; }

	public List<MyRecord> getAllMyRecords() { return allMyRecords; }
	public void setAllMyRecords(List<MyRecord> allMyRecords) { this.allMyRecords = allMyRecords;}
}
