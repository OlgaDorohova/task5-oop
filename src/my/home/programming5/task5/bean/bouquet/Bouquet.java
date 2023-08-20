package my.home.programming5.task5.bean.bouquet;

import java.io.Serializable;
import java.util.HashMap;

import java.util.Map;
import java.util.Objects;

import my.home.programming5.task5.bean.flower.Flower;
import my.home.programming5.task5.bean.packaging.Wrapper;

public class Bouquet implements Serializable {

	private static final long serialVersionUID = 4562226666351627258L;
	private Map<Flower, Integer> flowers;
	private Wrapper wrapper;

	public Bouquet() {

	}

	public Bouquet(Flower flower, int amount, Wrapper wrapper) {
		flowers = new HashMap<>();
		flowers.put(flower, amount);

	}

	public Map<Flower, Integer> getFlowers() {
		return flowers;
	}

	public void setFlowers(Map<Flower, Integer> flowers) {
		this.flowers = flowers;
	}

	public Wrapper getWrapper() {
		return wrapper;
	}

	public void setWrapper(Wrapper wrapper) {
		this.wrapper = wrapper;
	}

	public void addFlower(Flower flower, int amount) {
		if (flowers == null) {
			flowers = new HashMap<>();
		}

		if (flowers != null && flowers.containsKey(flower)) {
			flowers.put(flower, flowers.get(flower) + amount);
		} else {
			flowers.put(flower, amount);
		}

	}

	public void deleteFlower(Flower flower, int amount) {
		if (flowers == null) {
			return;
		}
		if (flowers.containsKey(flower)) {
			int tempAmount = flowers.get(flower) - amount;
			if (tempAmount > 0) {
				flowers.put(flower, tempAmount);
			} else {
				flowers.remove(flower, amount);
			}
		}

	}

	@Override
	public int hashCode() {
		return Objects.hash(flowers, wrapper);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Bouquet other = (Bouquet) obj;
		return Objects.equals(flowers, other.flowers) && Objects.equals(wrapper, other.wrapper);
	}

	@Override
	public String toString() {
		return "Composition [flowers=" + flowers + ", wrapper=" + wrapper + "]";
	}

}
