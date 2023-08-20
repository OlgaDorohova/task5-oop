package my.home.programming5.task3;

import java.util.Objects;

public class Date implements Comparable<Date>{
	private int day;
	private int month;
	private int year;
	
	
	
	public Date() {
		
	}
	
	public Date(int day, int month, int year) {
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}
	
	@Override
	public int compareTo(Date o) {
		if(o.getYear() == this.getYear()) {
			if(o.getMonth() == this.getMonth()) {
				return this.getDay() - o.getDay();
			} else {
				return this.getMonth() - o.getMonth();
			}
		}
		return this.getYear() - o.getYear();
	}

	@Override
	public int hashCode() {
		return Objects.hash(day, month, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Date other = (Date) obj;
		return day == other.day && month == other.month && year == other.year;
	}

	@Override
	public String toString() {
		return "Date [day=" + day + ", month=" + month + ", year=" + year + "]";
	}

	
	
	


	

	
}
