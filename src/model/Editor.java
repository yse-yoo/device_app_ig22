package model;

import java.io.FileWriter;
import java.io.IOException;

public class Editor extends Software {
	public Editor() {
		super(appName);
	}
	public static String appName = "Editor App";
	
	public void save(String path, String message) {
		System.out.println("save: " + path);
		
		FileWriter writer;
		try {
			writer = new FileWriter(path);
			writer.write(message);
			writer.close();
			System.out.println("保存しました");
		} catch (IOException e) {
			System.out.println("ファイルが書き込めませんでした");
		}
		
	}
}
