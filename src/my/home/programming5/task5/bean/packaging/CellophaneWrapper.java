package my.home.programming5.task5.bean.packaging;

import java.util.Objects;

import my.home.programming5.task5.bean.Color;

public class CellophaneWrapper extends Wrapper {

	private static final long serialVersionUID = -1671037840623649365L;
	private boolean isMirror;

	public CellophaneWrapper() {
		super();
	}

	public CellophaneWrapper(Color color, double price, boolean isMirror) {
		super(color, price);
		this.isMirror = isMirror;
	}

	

	public boolean isMirror() {
		return isMirror;
	}

	public void setMirror(boolean isMirror) {
		this.isMirror = isMirror;
	}

	@Override
	public String returnWrapper() {
		if(isMirror) {
			return "mirror " + getTypeWr();
		}
		return getTypeWr();
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(isMirror);
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
		CellophaneWrapper other = (CellophaneWrapper) obj;
		return isMirror == other.isMirror;
	}

	@Override
	public String toString() {
		return "CellophaneWrapper [isMirror=" + isMirror + "]";
	}

}
