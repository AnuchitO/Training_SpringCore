package com.nong.training.model;

public class DefaultMessage {
	private String message = "Spring is fun.";

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	@Override
	public String toString(){
		return this.message;
	} 
}
