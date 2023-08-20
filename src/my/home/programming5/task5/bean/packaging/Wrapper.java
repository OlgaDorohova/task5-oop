package my.home.programming5.task5.bean.packaging;

import java.io.Serializable;
import java.util.Objects;

import my.home.programming5.task5.bean.Color;

public class Wrapper implements Serializable{

	private static final long serialVersionUID = 2303145036053569572L;
	private String typeWr;
	private Color color;
	private double price;

	
	public Wrapper() {
		
	}
	
	public Wrapper(Color color, double price) {
		this.color = color;
		this.price = price;
	}

	public String getTypeWr() {
		return typeWr;
	}

	public void setTypeWr(String typeWr) {
		this.typeWr = typeWr;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	
	public String returnWrapper() {
		return "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(color, price, typeWr);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Wrapper other = (Wrapper) obj;
		return color == other.color
				&& Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& Objects.equals(typeWr, other.typeWr);
	}

	@Override
	public String toString() {
		return "Wrapper [typeWr=" + typeWr + ", color=" + color + ", price=" + price +  "]";
	}

}
