package com.OneSoft.oops3_Interface;

public class Smartphone implements Phone {

	@Override
	public void voiceCall() {
		System.out.println("voice call Available in this Phone");
		
	}

	@Override
	public void videoCall() {
		System.out.println("video call Available in this Phone");
		
	}

	@Override
	public void connectivity() {
		System.out.println("Good Connectivity in this Phone");
		
	}

	@Override
	public String cameraFunction(String tapping) {
		switch (tapping) {
		
		case "Single tapping" : return "Taking Picture"; 
		
		case "Double tapping" : return "Zooming"; 
		
		case "Continues tapping" : return "Continues shots"; 
		
		default : return "No Feauture addes";
		}
		
	}

}
