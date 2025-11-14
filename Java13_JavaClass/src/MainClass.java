
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 객체를 생성한다. 
		TestClass1 t1 = new TestClass1();
		System.out.printf("t1 : %s\n", t1);
		
		TestClass1 t2 = t1;
		System.out.printf("t2 : %s\n", t2);
		
		TestClass1 t3 = new TestClass1();
		System.out.printf("t3 : %s\n", t3);
		
		t1.memberA1 = 1000;
		System.out.printf("t1.memberA1 : %d\n", t1.memberA1);
		System.out.printf("t2.memberA1 : %d\n", t2.memberA1);
		System.out.printf("t3.memberA1 : %d\n", t3.memberA1);
		
	}

}

// 클래스 작성
class TestClass1{
	int memberA1 = 100;
}