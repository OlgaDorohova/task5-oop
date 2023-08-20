package my.home.programming5.task5.bean.flower;

public enum Type {
ROSE(100), GERBER(80), GLADIOLUS(35), HYDRANGEA(38), ANEMONE(42), 
CARNATION(56),TULIP(27), LILY(74), PEONY(31);
	
	private int price;
	
	private Type(int price) {
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
