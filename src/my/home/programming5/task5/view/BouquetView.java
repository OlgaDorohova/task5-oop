package my.home.programming5.task5.view;

import java.util.Map;

import my.home.programming5.task5.bean.bouquet.Bouquet;
import my.home.programming5.task5.bean.flower.Flower;
import my.home.programming5.task5.bean.packaging.Wrapper;
import my.home.programming5.task5.logic.Logic;

public class BouquetView {
	Bouquet bouquet;

	public static void showBouquet(Bouquet bouquet) {
		System.out.println("You create a bouquet:");
		showWrapper(bouquet);
		showFlower(bouquet);
		showTotalPrice(bouquet);
		
	}
	
	public static void showWrapper(Bouquet bouquet) {
		Wrapper wrapper = bouquet.getWrapper();
		System.out.println(wrapper.getColor().getColorName() + " " + wrapper.returnWrapper() + " wrapper for "  + wrapper.getPrice() + " per piece");
	}
	
	public static void showTotalPrice(Bouquet bouquet) {
		System.out.println("Total price: "+Logic.getPrice(bouquet));
	}
	
	public static void showFlower(Bouquet bouquet) {
		for(Map.Entry<Flower, Integer> entry: bouquet.getFlowers().entrySet()) {
			Flower flower = entry.getKey();
			System.out.println(entry.getValue() + " " + flower.getColor().getColorName()+ " "+ flower.getType() + " for " + flower.getType().getPrice()  + " per flower");
		}
	}
}
