package com.OneSoft.Exception_Training;

public class MultiCatchProgram {

	public static void main(String[] args) {
		System.out.println("Start");
		try {
			String[] s = {"vivek","dhinesh","sajin"};
			System.out.println(s[5].charAt(7));
		} catch (StringIndexOutOfBoundsException se) {
			se.printStackTrace();
		} catch (IndexOutOfBoundsException ie) {
			ie.printStackTrace();
		} catch (RuntimeException re) {
			re.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			System.out.println("Error Traced");
		}

	}

}
