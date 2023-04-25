package com.OneSoft.oops3_Interface;

public class UseSmartphone {

	public static void main(String[] args) {
		Smartphone s = new Smartphone();
		s.voiceCall();
		s.videoCall();
		s.connectivity();
		System.out.println(s.cameraFunction("Single tapping"));

	}

}
