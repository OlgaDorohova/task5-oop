package my.home.programming5.task4.dao;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Paths;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import my.home.programming5.task4.bean.Treasure;

public class TreasureAccess implements TreasureDao {
	private String path;
	public TreasureAccess(String path) {
		this.path = path;
	}
	
	

	@Override
	public List<Treasure> getAll() throws FileNotFoundException {
		List<String> sList = null;
		try {
			sList = Files.readAllLines(Paths.get(path));

		} catch (Exception e) {
			throw new FileNotFoundException();
		}

		List<Treasure> treasures = new ArrayList<>();
		Treasure treasure1;

		for (String str : sList) {
			String sArray[] = str.split(",");
			treasure1 = new Treasure();
			for (String s : sArray) {

				String string = s.substring(s.indexOf("=") + 1);

				if (s.contains("type")) {
					treasure1.setType(string);
				}
				if (s.contains("weight")) {
					treasure1.setWeight(Double.valueOf(string));
				}

				if (s.contains("price")) {
					treasure1.setPrice(Double.parseDouble(string));
				}
			}
			treasures.add(treasure1);
		}

		return treasures;
	}

	@Override
	public void addTreasure(Treasure treasure) throws FileNotFoundException {

		try (FileWriter writer = new FileWriter(new File(path), true)) {

			writer.write( "\n" +
					"type=" + treasure.getType() + ", weight=" + String.format(Locale.US, "%.3f", treasure.getWeight())
							+ ", price=" + String.format(Locale.US, "%.2f", treasure.getPrice()) );

		} catch (Exception e) {
			throw new FileNotFoundException();
		}

	}

	@Override
	public void deleteTreasure(Treasure treasure) throws FileNotFoundException {
		// TODO Auto-generated method stub
		try {
			List<String> sList = Files.readAllLines(Paths.get(path));
			FileWriter fw = new FileWriter(new File(path));
			String pat = ".+" + treasure.getType() + ".+" + treasure.getWeight() + ".+" + treasure.getPrice();
			Pattern pattern = Pattern.compile(pat);
			for (int i = 0; i < sList.size(); i++) {
				String s = sList.get(i);
				Matcher matcher = pattern.matcher(s);
				if (!matcher.find()) {
					fw.write(s + "\n");
				}
			}
			fw.close();
		} catch (Exception e) {
			throw new FileNotFoundException();
		}

	}
}
