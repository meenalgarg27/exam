package com.game.transformers.errorhandler;

public class ApplicationException extends RuntimeException {
	public ApplicationException(String exception) {
		super(exception);
	}
}