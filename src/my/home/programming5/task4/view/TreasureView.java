package my.home.programming5.task4.view;

import java.io.FileNotFoundException;
import java.util.List;

import my.home.programming5.task4.bean.Treasure;
import my.home.programming5.task4.dao.TreasureAccess;
import my.home.programming5.task4.logic.Logic;

public class TreasureView {

	public void showAll(TreasureAccess access) throws FileNotFoundException {
		List<Treasure> treasures = access.getAll();
		for (Treasure treasure : treasures) {
			System.out.println("type - " + treasure.getType() + "; weight = " + treasure.getWeight() + "; price = "
					+ treasure.getPrice());
		}
	}

	public void showMaxPrice(TreasureAccess access) throws FileNotFoundException {
		Treasure max = Logic.findMaxPriceTreasure(access.getAll());
		System.out.println("Max price treasure - " + max.getType() + ", price = " + max.getPrice()
				+ ", weight " + max.getWeight());
	}

	public void showTreasureList(TreasureAccess access, double money) throws FileNotFoundException {
		List<Treasure> treasures = Logic.getTreasureForSum(access.getAll(), money);
		if(treasures == null) {
			System.out.println("You don't have enough money!");
			return;
		}
		for (Treasure treasure : treasures) {
			System.out.println("type - " + treasure.getType() + "; weight = " + treasure.getWeight() + "; price = "
					+ treasure.getPrice());
		}
	}

}
