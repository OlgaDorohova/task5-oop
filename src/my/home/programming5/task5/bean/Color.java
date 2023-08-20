package my.home.programming5.task5.bean;

public enum Color {
	BLUE("blue"), WHITE("white"), YELLOW("yellow"), RED("red"), PINK("pink"), 
	VIOLET("violet"), PURPLE("purple"), BURGUNDY("burgundy");

	private String colorName;
	
	Color(String name){
		this.colorName = name;
	}

	public String getColorName() {
		return colorName;
	}

	public void setColorName(String colorName) {
		this.colorName = colorName;
	}
	
	
}
