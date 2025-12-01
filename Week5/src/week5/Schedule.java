package week5;

public class Schedule {
	String [] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
	String [] times = {"09:00 ~ 11:50", "12:00 ~ 14:50", "15:00 ~ 17:50", "18:00 ~ 20:50"};
	
	int day;
	int time;
	
	Schedule(int day, int time) {
		this.day = day;
		this.time = time;
	}
	
	void printSchedule() {
		System.out.printf("%s %s\n", days[day], times[time]);
	}
}

