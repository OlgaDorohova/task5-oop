package my.home.programming5.task5.builder;

import java.util.Random;

import my.home.programming5.task5.bean.Color;
import my.home.programming5.task5.bean.packaging.Ribbon;
import my.home.programming5.task5.bean.packaging.Wrapper;

public class RibbonBuilder extends WrapperBuilder{
	Ribbon ribbon = new Ribbon();
	@Override
	public void setType() {
		wrapper.setTypeWr("ribbon");
		
	}

	@Override
	public void setColor() {
		wrapper.setColor(Color.values()[new Random().nextInt(Color.values().length)]);
		
	}

	@Override
	public void setPrice() {
		wrapper.setPrice(8);
		
	}

	@Override
	void createWrapper() {
		wrapper = ribbon;
		
	}

	@Override
	Wrapper build() {
		createWrapper();
		setType();
		setColor();
		setPrice();
		setSpecial();
		return wrapper;
	}

	@Override
	void setSpecial() {
		ribbon.setTransparent(new Random().nextBoolean());
		
	}
	

}
