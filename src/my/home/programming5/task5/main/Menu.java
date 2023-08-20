package my.home.programming5.task5.main;

import java.util.Scanner;

import my.home.programming5.task5.bean.Color;
import my.home.programming5.task5.bean.bouquet.Bouquet;
import my.home.programming5.task5.bean.flower.Type;
import my.home.programming5.task5.builder.Director;
import my.home.programming5.task5.data.UserData;
import my.home.programming5.task5.view.BouquetView;
import my.home.programming5.task5.data.UserBouquet;

public class Menu {

	public static void start() {
		UserBouquet userBouquet = new UserBouquet();
		UserData userData;

		try (Scanner scanner = new Scanner(System.in)) {
			String s = "1";

			while (!s.equalsIgnoreCase("q")) {

				switch (s) {
				case "1":

					userBouquet.create();

					System.out.println("choose a wrapper:\n" + "1 - paper wrapper\n" + "2 - cellophane wrapper\n"
							+ "3 - ribbon \n>>");
					s = scanner.nextLine();

					switch (s) {
					case "1":
						userBouquet.setWrapper("paper");
						break;
					case "2":
						userBouquet.setWrapper("cellophane");
						break;
					default:
						userBouquet.setWrapper("ribbon");
					}

				case "2":
					userData = new UserData();

					for (Type t : Type.values()) {
						System.out.print(t + "\t");
						System.out.println();
					}
					System.out.println("what flowers do you want to add to the bouquet?\n>>");
					s = scanner.nextLine();
					userData.setType(s);

					for(Color c: Color.values()) {
						System.out.println(c);
					}
					System.out.println("what are their color\n>>?");
					s = scanner.nextLine();
					userData.setColor(s);

					while (true) {
						System.out.println("how many flowers do you want to add?\n>>");

						if (scanner.hasNextInt()) {
							userData.setAmount(scanner.nextInt());
							userBouquet.add(userData);

							break;
						} else {
							s = scanner.next();
							System.out.println("wrong number");
						}
					}

					break;

				case "3":
					try {
						Director director = new Director(userBouquet);
					 director.createBouquet();
					Bouquet bouquet = director.getBouquet();
					BouquetView.showBouquet(bouquet);
					} catch (IllegalArgumentException e) {
						System.out.println(e);
					}
					

					break;

				case "q":
					System.out.println("in case Q");
					return;

				}
				s = scanner.nextLine();

				System.out.println("What do you want?\n" + "1 - create a new bouquet; \n" + "2 - add flower;\n"
						+ "3 - finish the bouquet\n" + "q - exit\n>>");

			}

		} catch (Exception e) {
			System.out.println("error");
		}

	}

}
