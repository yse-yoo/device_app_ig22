package model;

public class Phone extends Software {
	public Phone() {
		super(appName);
	}
	public static String appName = "Phone App";
	
	public void call(String number) {
		System.out.println(number);
	}
	
}
