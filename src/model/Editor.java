package model;

public class Editor extends Software {
	public Editor() {
		super(appName);
	}
	public static String appName = "Editor App";
	
	public void save(String path, String message) {
		System.out.println("save: " + path);
	}
}
