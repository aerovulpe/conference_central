package com.google.devrel.training.conference.domain;

public class Announcement {
	public String message;

	public Announcement() {

	}

	public Announcement(String announcement) {
		this.message = announcement;
	}

	public String getMessage() {
		return message;
	}

}
