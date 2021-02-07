package com.hcl.controller.notification;

public enum Notification {
	// Enum values
	INVALID_USER("Please, Sign in."),
	SUCCESSFULL_BID("Successfully placed a bid!"),
	UNSUCCESSFULL_BID("Bid is not placed.");
	
	// Instance variables
	private String message;
	
	private Notification(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
