package my.home.programming5.task5.builder;

import java.util.Random;

import my.home.programming5.task5.bean.Color;
import my.home.programming5.task5.bean.packaging.PaperWrapper;
import my.home.programming5.task5.bean.packaging.Wrapper;

public class PaperBuilder extends WrapperBuilder{
PaperWrapper pWrapper = new PaperWrapper();

	@Override
	public void setType() {
		pWrapper.setTypeWr("paper");
		
	}

	@Override
	public void setColor() {
		pWrapper.setColor(Color.values()[new Random().nextInt(Color.values().length)]);
		
	}

	@Override
	public void setPrice() {
		pWrapper.setPrice(18);
		
	}

	@Override
	void setSpecial() {
		pWrapper.setCrepe(new Random().nextBoolean());
		
	}

	@Override
	void createWrapper() {	
		wrapper = pWrapper;
	}

	@Override
	Wrapper build() {
		createWrapper();
		setType();
		setColor();
		setPrice();
		setSpecial();
		return pWrapper;
	}

	




}
