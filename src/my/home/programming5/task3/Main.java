package my.home.programming5.task3;

/*Создать класс Календарь с внутренним классом, 
с помощью объектов которого можно хранить информацию о выходных и праздничных днях.
*/
import java.util.Set;

import my.home.programming5.task3.Calendar.FreeDate;

public class Main {

	public static void main(String[] args) {
		Calendar cal = new Calendar();
		cal.createFreeCalendar(3, 3, 2020);
		cal.addFreeDay(8, 3, 2020, "Women's Day");
		cal.addFreeDay(20, 03, 2020, "National Holiday");
		

	Set<FreeDate> setDate = cal.getCustomerHoliday();
	
	for(FreeDate fd: setDate) {
		System.out.println(fd.getDay() + "-" +fd.getMonth()+ "-" +fd.getYear() + "\t" + fd.getReason());
	}
	
	}

}
