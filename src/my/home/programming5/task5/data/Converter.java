package my.home.programming5.task5.data;

import java.util.regex.Pattern;

import my.home.programming5.task5.bean.Color;
import my.home.programming5.task5.bean.flower.Type;

public class Converter {
	
	public static Type typeConvert(String type) throws IllegalArgumentException{
		String s = type.strip();
		if (Pattern.matches("r.+e", s) ){
			return Type.ROSE;
		}

		if (Pattern.matches("g.rb.+", s)) {
			return Type.GERBER;
		}

		if (Pattern.matches("gl.+s", s)) {
			return Type.GLADIOLUS;
		}

		if (Pattern.matches("h.+g.+", s)) {
			return Type.HYDRANGEA;
		}

		if (Pattern.matches("an.+n.*", s)) {
			return Type.ANEMONE;
		}

		if (Pattern.matches("ca.+n.*", s)) {
			return Type.CARNATION;
		}
		if (Pattern.matches("tu.+p.*", s)) {
			return Type.TULIP;
		}
		if (Pattern.matches("^li.+", s)) {
			return Type.LILY;
		}

		if (Pattern.matches("peo.+", s)) {
			return Type.PEONY;
		}
		
			throw new IllegalArgumentException("unknown type: " + type);
		
	}

	public static Color colorConvert(String color) throws IllegalArgumentException{
		String s = color.strip();
		
		if (Pattern.matches("r..", s) || Pattern.matches("r.+d", s)) {
			return Color.RED;
		}

		if (Pattern.matches("b..*e*", s)) {
			return Color.BLUE;
		}

		if (Pattern.matches("wh..+e", s)) {
			return Color.WHITE;
		}

		if (Pattern.matches("y*e..+w", s)) {
			return Color.YELLOW;
		}

		if (Pattern.matches("p.+k", s)) {
			return Color.PINK;
		}

		if (Pattern.matches("v...+t", s)) {
			return Color.VIOLET;
		}
		if (Pattern.matches("p..+le*", s)) {
			return Color.PURPLE;
		}
		if (Pattern.matches("b....+y", s)) {
			return Color.BURGUNDY;
		}

		throw new IllegalArgumentException(color);
		

	}

}
