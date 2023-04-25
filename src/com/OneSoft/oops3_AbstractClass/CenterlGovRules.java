package com.OneSoft.oops3_AbstractClass;

public abstract class CenterlGovRules implements NumberPlateRules {
	
	@Override
	public String fontStyle(String style) {
		return style;
	}
	
	@Override
	public int fontSize(int size) {
		return size;
	}

}
