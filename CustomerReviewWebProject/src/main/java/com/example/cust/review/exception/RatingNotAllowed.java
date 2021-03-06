package com.example.cust.review.exception;

public class RatingNotAllowed extends Exception {

	private static final long serialVersionUID = 1L;
	private String errorMessage;

	public String getErrorMessage() {
		return errorMessage;
	}

	public RatingNotAllowed(String errorMessage) {
		super(errorMessage);
		this.errorMessage = errorMessage;
	}

	public RatingNotAllowed() {
		super();
	}

}
