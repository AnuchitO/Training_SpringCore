package com.nong.training.model;

public class ConstructorMessage {
	private String message;

	public ConstructorMessage() {

	}

	public ConstructorMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return this.message;
	}

}
