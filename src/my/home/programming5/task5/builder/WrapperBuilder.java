package my.home.programming5.task5.builder;

import my.home.programming5.task5.bean.packaging.Wrapper;

public abstract class WrapperBuilder implements Builder{
Wrapper wrapper;
	
	abstract void createWrapper() throws IllegalArgumentException;
	
	public Wrapper getWrapper() {
		return wrapper;
	}

	abstract void setSpecial() ;
	abstract Wrapper build();
}
