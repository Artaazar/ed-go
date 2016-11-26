package org.c3s.edgo.web.validator;

public class MinLength implements Validator {

	private String text = "minlength";
	private int length = 0;
	
	public MinLength(int length) {
		this.length = length;
	}
	
	public MinLength(int length, String text) {
		this(length);
		this.text = text;
	}

	@Override
	public String validate(String value) {
		return (value == null || value.length() < length)?text:null;
	}

}
