package com.mygym.app.models;

import java.util.List;

public class ProgressRecords {

	private List<MyRecord> chestRecords;
	private List<MyRecord> shoulderRecords;
	private List<MyRecord> backRecords;
	private List<MyRecord> bicepRecords;
	private List<MyRecord> tricepRecords;
	private List<MyRecord> legRecords;
	private List<MyRecord> absRecords;
	private List<MyRecord> cardioRecords;
	
	public ProgressRecords(List<MyRecord> chestRecords, List<MyRecord> shoulderRecords, List<MyRecord> backRecords,
			List<MyRecord> bicepRecords, List<MyRecord> tricepRecords,List<MyRecord> legRecords, List<MyRecord> absRecords,
			List<MyRecord> cardioRecords) {
		this.chestRecords = chestRecords;
		this.shoulderRecords = shoulderRecords;
		this.backRecords = backRecords;
		this.bicepRecords = bicepRecords;
		this.tricepRecords = tricepRecords;
		this.setLegRecords(legRecords);
		this.absRecords = absRecords;
		this.cardioRecords = cardioRecords;
	}
	public ProgressRecords() {}

	public List<MyRecord> getChestRecords() { return chestRecords; }
	public void setChestRecords(List<MyRecord> chestRecords) { this.chestRecords = chestRecords; }

	public List<MyRecord> getShoulderRecords() { return shoulderRecords; }
	public void setShoulderRecords(List<MyRecord> shoulderRecords) { this.shoulderRecords = shoulderRecords;	}

	public List<MyRecord> getBackRecords() { return backRecords;	}
	public void setBackRecords(List<MyRecord> backRecords) { this.backRecords = backRecords;	}

	public List<MyRecord> getBicepRecords() { return bicepRecords;	}
	public void setBicepRecords(List<MyRecord> bicepRecords) { this.bicepRecords = bicepRecords; }

	public List<MyRecord> getTricepRecords() {	return tricepRecords;	}
	public void setTricepRecords(List<MyRecord> tricepRecords) { this.tricepRecords = tricepRecords;	}

	public List<MyRecord> getLegRecords() { return legRecords; }
	public void setLegRecords(List<MyRecord> legRecords) { this.legRecords = legRecords; }
	
	public List<MyRecord> getAbsRecords() {	return absRecords; }
	public void setAbsRecords(List<MyRecord> absRecords) { this.absRecords = absRecords;	}

	public List<MyRecord> getCardioRecords() { return cardioRecords; }
	public void setCardioRecords(List<MyRecord> cardioRecords) {	this.cardioRecords = cardioRecords;}
	
}
