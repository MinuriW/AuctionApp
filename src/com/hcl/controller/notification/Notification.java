package com.hcl.controller.notification;

public enum Notification {
	// Enum values
	INVALID_USER("Please, Sign in.");
	
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
