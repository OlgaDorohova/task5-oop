package my.home.programming5.task3;

//import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Calendar {
	private FreeDate date;
	private Set<FreeDate> customerHoliday;

	public FreeDate getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = (FreeDate) date;
	}

	public Set<FreeDate> getCustomerHoliday() {
		return customerHoliday;
	}

	public void setCustomerHoliday(Set<FreeDate> customerHoliday) {
		this.customerHoliday = customerHoliday;
	}

	public Calendar() {
		customerHoliday = new TreeSet<>();
	}

	public void createFreeCalendar(int startMonth, int finishMonth, int year) {
		for(int i = startMonth; i <= finishMonth; i++) {
			
			int lastDay;
			if(i < 8) {
				if(i==2) {
					lastDay = (isLeapYear(year)) ? 29 : 28;
				} else {
					lastDay = (i % 2 == 0) ? 30 : 31;
				}
			} else {
				lastDay = (i % 2 == 0) ? 31 : 30;
			}
			
			for(int j = 1; j <= lastDay; j++) {
				FreeDate date = new FreeDate(j, i, year, "weekend");
				if(date.getFree()) {
					customerHoliday.add(date);
				}
			}
		}
	}
	
	public boolean isLeapYear(int year) {
		if ( ( ( year % 4 == 0 ) && ( year % 100 != 0 ) ) || ( year % 400 == 0 ) ) {
			return true;
		}
		return false;
	}
	
	public void addFreeDay(int day, int month, int year, String reason) {
		FreeDate date = new FreeDate(day, month, year, reason);
		if(!customerHoliday.contains(date)) {
			customerHoliday.add(date);
		} else {
			
			if(date.getConvert() == 1) {
				customerHoliday.add(new FreeDate(day - 1, month, year, "weekend"));
			} else {
				if(date.getConvert() ==2) {
					customerHoliday.add(new FreeDate(day + 1, month, year, "weekend"));
				}
			}
			customerHoliday.remove(date);
			customerHoliday.add(date);
		}
	}

	class FreeDate extends Date {
		private boolean free;
		private String reason;
		
		public FreeDate() {
		super();
		}
		
		public FreeDate(int day, int month, int year, String reason) {
			super(day, month, year);
			setFree();
			this.reason = reason;
		}
		
		public int getConvert() {
			int month = (getMonth() >= 3) ? getMonth() + 2 : getMonth() + 10;
			
			return (getDay() + (13 * month -1) / 5 + getYear() - getYear() / 100 + getYear() / 400) % 7;
		}
		
		public void setFree() {
			int value = getConvert();
			if(value == 1 || value == 2) {
				free = true;
			} else {
				free = false;
			}
			
		}
		
		public boolean getFree() {
			return free;
		}
		public String getReason() {
			return reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = super.hashCode();
			result = prime * result + getEnclosingInstance().hashCode();
			result = prime * result + Objects.hash(free, reason);
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (!super.equals(obj))
				return false;
			if (getClass() != obj.getClass())
				return false;
			FreeDate other = (FreeDate) obj;
			if (!getEnclosingInstance().equals(other.getEnclosingInstance()))
				return false;
			return free == other.free && Objects.equals(reason, other.reason);
		}

		private Calendar getEnclosingInstance() {
			return Calendar.this;
		}

		@Override
		public String toString() {
			return super.toString() + "FreeDate [free=" + free + ", reason=" + reason + "]";
		}

		
	}

	
	
	

}
