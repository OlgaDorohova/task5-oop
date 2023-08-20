package my.home.programming5.task4.logic;

import java.util.ArrayList;
import java.util.List;

import my.home.programming5.task4.bean.Treasure;

public class Logic {

	public static Treasure findMaxPriceTreasure(List<Treasure> treasures) {
		Treasure treasure = new Treasure();
		for (Treasure t : treasures) {
			if (treasure.getPrice() < t.getPrice()) {
				treasure = t;
			}
		}
		return treasure;
	}

	public static List<Treasure> getTreasureForSum(List<Treasure> treasures, double sum) {
		List<Treasure> toReturnList = new ArrayList<>();
		double tempSum = 0;
		int i = 0;
		while (treasures.get(i).getPrice() > sum) {
			i++;
			if(i >= treasures.size()) {
				return null;
			}
		}

		for (int j = 0; i < treasures.size(); i++) {
			if (tempSum+ treasures.get(i).getPrice() <= sum) {
				toReturnList.add(treasures.get(i));
				tempSum += toReturnList.get(j).getPrice();
				j++;
			}
		}

		return toReturnList;
	}
}
