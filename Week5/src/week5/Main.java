package week5;

public class Main {

	public static void main(String[] args) {
//		Schedule s = new Schedule(0, 3);
//		s.printSchedule();
//		Schedule s1 = new Schedule(1, 2);
//		s1.printSchedule();
//		
//		
//		Course c = new Course("EE", s1);
//		c.printInfo();
//		
//		Course c1 = new Course("CES", s, "302");
//		c1.printInfo();
//		
//		Course c2 = new Course("CES", s, 302, 105);
//		c2.printInfo();
//		
//		MyTimeTable t = new MyTimeTable("2025 Fall");
//		t.addCourse(c2);
//		t.addCourse(c);
//		t.printAll();
		// 최대 학점 6(= 과목 2개만 허용)으로 설정해 메시지 케이스 검증
        MyTimeTable tt = new MyTimeTable("2025 Fall", 6);

        // 1) 성공 추가 (메시지: Course added successfully)
        Schedule sc1 = new Schedule(0, 0); // Monday 09:00 ~ 11:50
        Course c1 = new Course("System Programming", sc1, 302, 105);
        tt.addCourse(c1);

        // 2) 성공 추가 (메시지: Course added successfully)
        Schedule sc2 = new Schedule(1, 1); // Tuesday 12:00 ~ 14:50
        Course c2 = new Course("Computer Programming", sc2, "301-101");
        tt.addCourse(c2);

        // 3) 시간 겹침 시도 (메시지: Already have another course that time)
        Schedule scConflict = new Schedule(1, 1); // Tuesday 12:00 ~ 14:50 (겹침)
        Course cConflict = new Course("Data Structures", scConflict, 301, 202);
        tt.addCourse(cConflict);

        // 4) 최대 학점 초과 시도 (메시지: Credit exceeded)
        Schedule scOver = new Schedule(3, 3); // Thursday 18:00 ~ 20:50
        Course cOver = new Course("Discrete Math", scOver, 302, 201);
        tt.addCourse(cOver);

        // 5) 같은 이름 강의 중복 시도 (요구: 메시지 없음, 조용히 무시)
        Schedule scDupName = new Schedule(2, 2); // Wednesday 15:00 ~ 17:50
        Course cDupName = new Course("System Programming", scDupName, "TBD");
        tt.addCourse(cDupName);

        // 6) 최종 출력 (형식: 학기 → "credits: X" → 빈 줄 → 각 강의 정보(각 뒤에 빈 줄))
        tt.printAll();
	}

}
