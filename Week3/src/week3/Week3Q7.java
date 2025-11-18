package week3;

class Student{
	String name = "Hong Gil Dong";
	String studentID = "1234-56789";
	public void method() {
		System.out.println("fix it!");
	}
}
public class Week3Q7 {
	public static void main(String[] args) {
		Student me = new Student();
		System.out.println(me.name);
		System.out.println(me.studentID);

	}

}
//Hong Gil Dong
//1234-56789