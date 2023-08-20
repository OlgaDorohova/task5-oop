package my.home.programming5.task4.menu;

import java.io.FileNotFoundException;
import java.util.Scanner;

import my.home.programming5.task4.dao.TreasureAccess;
import my.home.programming5.task4.view.TreasureView;

public class TreasureMenu {

	private String path = "data\\Treasures.txt";
	private TreasureAccess access = new TreasureAccess(path);

	public void startMenu() throws FileNotFoundException {
		TreasureView view = new TreasureView();

		System.out.println("What do you want to do?");
		System.out.println("1 - show all Dragon treasures" + "\n" + "2 - find treasure with max price" + "\n"
				+ "3 - take some treasureas for the price" + "\n" + "Q - quit" + "\n");
		System.out.print(">>");

		while (true) {
			String reader = readConsole();
			if (reader.equalsIgnoreCase("q")) {
				return;
			}

			switch (reader) {
			case "1":
				view.showAll(access);
				System.out.print(">>");

				break;

			case "2":
				view.showMaxPrice(access);
				System.out.print(">>");
				break;

			case "3":
				System.out.println("Write how much money do you have");
				System.out.print(">>");
				while (true) {
					String string = readConsole();
					double d;
					try {
						d = Double.valueOf(string);
						view.showTreasureList(access, d);
						System.out.println(">>");

						break;
					} catch (NumberFormatException e) {
						System.out.println("Wrong cash. Repeat or press \"Q\"");
						System.out.print(">>");
					}
				}
				break;

			case "wrong":
				System.out.println("Error!");
				return;

			default:
				System.out.println("What do you want to do?");
				System.out.println("1 - show all Dragon treasures" + "\n" + "2 - find treasure with max price" + "\n"
						+ "3 - take some treasureas for the price" + "\n" + "Q - quit" + "\n");
				System.out.print(">>");
			}

		}
	}

	public String readConsole() {
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String ans = "wrong";
		if (scanner.hasNext()) {
			ans = scanner.nextLine();

		}

		return ans;

	}

	public TreasureAccess getAccess() {
		return access;
	}

	public void setAccess(TreasureAccess access) {
		this.access = access;
	}

}
