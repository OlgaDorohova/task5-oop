package my.home.programming5.task5.bean.flower;

import java.io.Serializable;
import java.util.Objects;

import my.home.programming5.task5.bean.Color;

public class Flower implements Serializable {

	private static final long serialVersionUID = 8883261623327136931L;
	private Type type;
	private double price;
	private Color color;

	public Flower() {
	}

	public Flower(Type type, Color color, double price) {
		this.type = type;
		this.color = color;
		this.price = price;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public Type getType() {
		return this.type;
	}

	public Color getColor() {
		return color;
	}

	
	@Override
	public int hashCode() {
		return Objects.hash(color, price, type);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Flower other = (Flower) obj;
		return color == other.color && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& type == other.type;
	}

	@Override
	public String toString() {
		return "Flower [type=" + type + ", price=" + price + ", color=" + color + "]";
	}

}
