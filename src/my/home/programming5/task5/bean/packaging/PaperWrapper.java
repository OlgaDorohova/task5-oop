package my.home.programming5.task5.bean.packaging;

import java.util.Objects;

import my.home.programming5.task5.bean.Color;

public class PaperWrapper extends Wrapper {

	private static final long serialVersionUID = -4228528053443729216L;
	private boolean isCrepe;

	public PaperWrapper() {
		super();
	}

	public PaperWrapper(Color color, boolean isCrepe, double price) {
		super(color, price);
		this.isCrepe = isCrepe;
	}

	public void setCrepe(boolean isCrepe) {
		this.isCrepe = isCrepe;
	}
	
	@Override
	public String returnWrapper() {
		if(isCrepe) {
			return "crep " + getTypeWr();
		}
		return getTypeWr();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(isCrepe);
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
		PaperWrapper other = (PaperWrapper) obj;
		return isCrepe == other.isCrepe;
	}

	@Override
	public String toString() {
		return "PaperWripper [isCrepe=" + isCrepe + "]";
	}

}
