package model;

public class Camera extends Software {
	public Camera() {
		super(appName);
	}
	public static String appName = "Camera App";
	
	public void shoot() {
		System.out.println("save a picture");
	}
}
