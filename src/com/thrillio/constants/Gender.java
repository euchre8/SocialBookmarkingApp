package com.thrillio.constants;

public enum Gender {
	MALE(0),
	FEMALE(1),
	TRANSGENDER(2);
	
	private Gender(int value) {
		this.value = value;
	}
	
	private int value;

	public int getValue() {
		return value;
	}
	
	
}
