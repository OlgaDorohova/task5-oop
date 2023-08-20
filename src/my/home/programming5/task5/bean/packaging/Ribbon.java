package my.home.programming5.task5.bean.packaging;

import java.util.Objects;

import my.home.programming5.task5.bean.Color;

public class Ribbon extends Wrapper {

	private static final long serialVersionUID = 4918936518252893563L;
	boolean isTransparent;
	
	public Ribbon() {
	super();
}
	
	

public void setTransparent(boolean isTransparent) {
		this.isTransparent = isTransparent;
	}



public Ribbon(Color color,double price) {
	super(color, price);
	
}
@Override
public String returnWrapper() {
	if(isTransparent) {
		
		return "transparent " + getTypeWr();
		
	}
	return getTypeWr();
}

@Override
public int hashCode() {
	final int prime = 31;
	int result = super.hashCode();
	result = prime * result + Objects.hash(isTransparent);
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (!super.equals(obj))
		return false;
	if (getClass() != obj.getClass())
		return false;
	Ribbon other = (Ribbon) obj;
	return isTransparent == other.isTransparent;
}

@Override
public String toString() {
	return "Ribbon [isTransparent=" + isTransparent + "]";
}


}
