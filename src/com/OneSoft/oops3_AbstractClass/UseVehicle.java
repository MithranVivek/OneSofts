package com.OneSoft.oops3_AbstractClass;

public class UseVehicle {

	public static void main(String[] args) {
		TamilnaduGovRules tn = new TamilnaduGovRules();
		System.out.println(tn.fontStyle("Bold")+"\n"+
							tn.fontSize(16)+"\n"+
							tn.stateCode("TN")+"\n"+
							tn.numberPlateColour("public vehicle"));

	}

}
