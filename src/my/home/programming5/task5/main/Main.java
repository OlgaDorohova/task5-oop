package my.home.programming5.task5.main;

import java.util.ArrayList;
import java.util.List;

import my.home.programming5.task5.bean.bouquet.Bouquet;
import my.home.programming5.task5.builder.Director;
import my.home.programming5.task5.data.UserData;
import my.home.programming5.task5.data.UserBouquet;
import my.home.programming5.task5.view.BouquetView;

/*
Создать консольное приложение, удовлетворяющее следующим требованиям:
• Корректно спроектируйте и реализуйте предметную область задачи.
• Для создания объектов из иерархии классов продумайте возможность использования 
порождающих шаблонов проектирования.
• Реализуйте проверку данных, вводимых пользователем, но не на стороне клиента.
• для проверки корректности переданных данных можно применить регулярные выражения.
• Меню выбора действия пользователем можно не реализовывать, используйте заглушку.
• Особое условие: переопределите, где необходимо, методы toString(), equals() и hashCode().
Вариант A. Цветочная композиция. Реализовать приложение, позволяющее создавать цветочные композиции
(объект, представляющий собой цветочную композицию). Составляющими цветочной композиции являются 
цветы и упаковка.
Вариант B. Подарки. Реализовать приложение, позволяющее создавать подарки (объект, представляющий
собой подарок). Составляющими целого подарка являются сладости и упаковка.
*/
public class Main {

	public static void main(String[] args) {

// Start app with a mock

		List<UserData> userFlowers = new ArrayList<>();
		userFlowers.add(new UserData("rose", "red", 30));
		userFlowers.add(new UserData("tulip", "pink", 10));
		userFlowers.add(new UserData("rose", "white", 15));

		UserBouquet userBouquet = new UserBouquet(userFlowers);
		userBouquet.setWrapper("ribbon");
		try {
			Director director = new Director(userBouquet);
			director.createBouquet();

			Bouquet bouquet = director.getBouquet();
			BouquetView.showBouquet(bouquet);

		} catch (Exception e) {
			System.out.println(e);
		}

// Start app with a console menu

//		new Menu().start();

	}

}
