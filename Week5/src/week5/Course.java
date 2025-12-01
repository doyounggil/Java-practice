package week5;

public class Course {
	String lecture;
	Schedule s;
	String room;
	
	Course(String lecture, Schedule s){
		this.room = "TBD";
		this.lecture = lecture;
		this.s = s;
	}
	Course(String lecture, Schedule s, String room){
		this.room = room;
		this.lecture = lecture;
		this.s = s;
	}
	Course(String lecture, Schedule s, int dong, int num){
		this.room = dong + "-" + num;
		this.lecture = lecture;
		this.s = s;
	}
	
	void printInfo() {
		System.out.printf("%s\n", lecture);
		System.out.printf("time: " );
		s.printSchedule();
		System.out.printf("classroom: %s\n", room);
	}
}
