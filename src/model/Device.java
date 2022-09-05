package model;

import java.util.ArrayList;

public class Device {

	public ArrayList<Software> softwares = new ArrayList<>();
	
	public void install(Software app) {
		softwares.add(app);
		System.out.println(app.getName() + " is success.");
	}
}
