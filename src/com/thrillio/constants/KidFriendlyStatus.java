package com.thrillio.constants;

public enum KidFriendlyStatus {
	APPROVED("approved"),
	REJECTED("rejected"),
	UNKNOWN("unknown");
	
	private KidFriendlyStatus(String name) {
		this.name = name;
	}
	
	private String name;

	public String getName() {
		return name;
	}
	
}