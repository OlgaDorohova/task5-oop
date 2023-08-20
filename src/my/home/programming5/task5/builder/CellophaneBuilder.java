package my.home.programming5.task5.builder;

import java.util.Random;

import my.home.programming5.task5.bean.Color;
import my.home.programming5.task5.bean.packaging.CellophaneWrapper;
import my.home.programming5.task5.bean.packaging.Wrapper;

public class CellophaneBuilder extends WrapperBuilder {
CellophaneWrapper cWrapper ;
	@Override
	public void setType() {
		cWrapper.setTypeWr("cellophane");
		
	}

	@Override
	public void setColor() {
		cWrapper.setColor(Color.values()[new Random().nextInt(Color.values().length)]);
		
	}

	@Override
	public void setPrice() {
		cWrapper.setPrice(12);
		
	}

	@Override
	void createWrapper() {
		cWrapper = new CellophaneWrapper();
		wrapper = cWrapper;
		
	}

	@Override
	void setSpecial() {
cWrapper.setMirror(new Random().nextBoolean());		
	}

	@Override
	Wrapper build() {
		createWrapper();
		setType();
		setColor();
		setPrice();
		setSpecial();
		return cWrapper;
	}
}
