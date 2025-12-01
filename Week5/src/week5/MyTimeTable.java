package week5;

public class MyTimeTable {
	String session;
	int credit;
	int creditMax;
	Course[][] table; 
	
	MyTimeTable(String session){
		this.session = session;
		this.credit = 0;
		this.creditMax = 18;
		this.table = new Course[5][4];
	}
	MyTimeTable(String session, int creditMax){
		this.session = session;
		this.creditMax = creditMax;
		this.credit = 0;
		this.table = new Course[5][4];
	}
	
	void addCourse(Course c){
		for (int d = 0; d < 5; d++) {
			for (int t = 0; t < 4; t++) {
				Course cur = table[d][t];
	            if (cur != null && cur.lecture.equals(c.lecture)) {
	                return;
	            }
	        }
		}
		
		
		int day = c.s.day;
		int time = c.s.time;
		
		if(table[day][time] != null) {
			System.out.println("Already have another course that time");
			return;
		}
		if(credit + 3 > creditMax) {
			System.out.println("Credit exceeded");
			return;
		}
		table[day][time] = c ;
		credit += 3;
		System.out.println("Course added successfully");
	}
	
	void removeCourse(String lec){
		for (int d = 0; d < 5; d++) {
			for (int t = 0; t < 4; t++) {
				Course cur = table[d][t];
	            if (cur != null && cur.lecture.equals(lec)) {
	            	table[d][t] = null;
	                credit -= 3; 
	                return;
	            }
	        }
		}
	}	
	
	void printAll(){
		System.out.printf("%s\n", session);
		System.out.printf("credits: %s\n", credit);
		System.out.println();
		for (int d = 0; d < 5; d++) {
			for (int t = 0; t < 4; t++) {
				Course cur = table[d][t];
				if(table[d][t]!=null) {
					cur.printInfo();
					System.out.println();
				}
				
			}
		}
	}	
}