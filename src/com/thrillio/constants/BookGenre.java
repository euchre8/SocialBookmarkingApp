package com.thrillio.constants;

public enum BookGenre {
	
	ART("Art"),
	BIOGRAPHY("Biography"),
	CHILDREN("Children"),
	FICTION("Fiction"),
	HISTORY("History"),
	MYSTERY("Mystery"),
	PHILOSOPHY("Philosophy"),
	RELIGION("Religion"),
	ROMANCE("Romance"),
	SELF_HELP("Self help"),
	TECHNICAL("Technical");
	
	private BookGenre(String name) {
		this.name = name;
	}
	
	private String name;

	public String getName() {
		return name;
	}
}
