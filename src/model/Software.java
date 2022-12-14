package model;

public class Software implements ISoftware {
	
	public Software(String name) {
		this.name = name;
	}

	private String name;

	// getter
	public String getName() {
		return name;
	}

	// setter
	public void setName(String name) {
		this.name = name;
	}

	// @ の書き方はアノテーション
	@Override
	public void launch() {
		System.out.println(this.name + " is launched.");
	}


}