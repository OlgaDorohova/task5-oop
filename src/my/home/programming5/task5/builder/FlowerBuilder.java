package my.home.programming5.task5.builder;

import my.home.programming5.task5.bean.flower.Flower;
import my.home.programming5.task5.data.UserData;
import my.home.programming5.task5.data.Converter;

public class FlowerBuilder implements Builder {

	protected Flower flower;
	private UserData data;

	public Flower getFlower() {
		return flower;
	}

	public Flower createFlower(UserData userData) {
		this.data = userData;
		flower = new Flower();
		return flower;
	}

	public void setType() {
		flower.setType(Converter.typeConvert(data.getType()));

	}

	public void setColor() {
		flower.setColor(Converter.colorConvert(data.getColor()));

	}

	public void setPrice() {
		flower.setPrice(Converter.typeConvert(data.getType()).getPrice());

	}
	
	public Flower build(UserData data) throws IllegalArgumentException{
		createFlower(data);
		setType();
		setColor();
		setPrice();
		return flower;
	}

}
