package my.home.programming5.task5.logic;

import java.util.Map;

import my.home.programming5.task5.bean.bouquet.Bouquet;
import my.home.programming5.task5.bean.flower.Flower;

public class Logic {

	public static double getPrice(Bouquet bouquet) {
		double totalPrice = bouquet.getWrapper().getPrice();

		for (Map.Entry<Flower, Integer> entry : bouquet.getFlowers().entrySet()) {
			totalPrice += entry.getValue() * entry.getKey().getType().getPrice();
		}

		return totalPrice;
	}
}
