package com.OneSoft.oops3_AbstractClass;

public class TamilnaduGovRules extends CenterlGovRules {

	@Override
	public String numberPlateColour(String vehicleType) {
		if(vehicleType.equals("private vehicle")) {
		return "Black & Yellow";
		}
		else if(vehicleType.equals("public vehicle")) {
			return "Black & White";
			}
		else if(vehicleType.equals("electric vehicle")) {
			return "White & Green";
			}
		else {
			return "Invalid";
		}
	}

	@Override
	public String stateCode(String stateCode) {
		return stateCode;
	}

}
