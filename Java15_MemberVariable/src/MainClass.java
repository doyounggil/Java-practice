
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 t1 = new TestClass1();
		t1.a1 = 100;
		t1.a2 = 200;
		
		TestClass1 t2 = new TestClass1();
		t2.a1 = 1000;
		t2.a2 = 2000;
		System.out.printf("t1.a1 : %d\n", t1.a1);
		System.out.printf("t1.a2 : %d\n", t1.a2);
		
		System.out.printf("t2.a1 : %d\n", t2.a1);
		System.out.printf("t2.a2 : %d\n", t2.a2);
		
		t1.testMethod1();
		t2.testMethod1();
		
		t1.testMethod2();
		t1.testMethod3();
		t1.testMethod4(); 
	}

}

class TestClass1{
	// 멤버 변수
	// 멤버 변수는 객체를 생성해야지만 메모리에 생성된다.
	int a1;
	int a2;
	
	// 메서드 내부에서는 이 메서드를 호출하기 위해 사용한 객체가 가지고 있는 멤버 변수를 사용하게 된다.
	public void testMethod1() {
		System.out.printf("멤버변수 a1 : %d\n", a1);
		System.out.printf("멤버변수 a2 : %d\n", a2);
	}
	
	public void testMethod2() {
		// 지역 변수
		int a3 = 300;
		int a4 = 400;
		System.out.printf("멤버변수 a1 : %d\n", a1);
		System.out.printf("멤버변수 a2 : %d\n", a2);
		System.out.printf("지역변수 a3 : %d\n", a3);
		System.out.printf("지역변수 a4 : %d\n", a4);
	}
	public void testMethod3() {
		System.out.printf("멤버변수 a1 : %d\n", a1);
		System.out.printf("멤버변수 a2 : %d\n", a2);
		// testMethod2에서 선언된 지역변수 a3,a4는 해당 메서드가 끝나면 소멸되기 때문에 다른 곳에서 사용이 불가능하다.
		// System.out.printf("지역변수 a3 : %d\n", a3);
		//System.out.printf("지역변수 a4 : %d\n", a4);
	} 
	public void testMethod4() {
		// 멤버 변수의 이름과 동일한 지역 변수
		int a1 = 300;
		int a2 = 400;
		System.out.println();
		// 지역변수의 이름과 멤버변수의 이름이 같을 때, 지역변수 먼저 사용. 멤버변수에 접근할 때 => this. 
		System.out.printf("지역변수 a1 : %d\n", a1); 
		System.out.printf("지역변수 a2 : %d\n", a2);
		System.out.printf("멤버변수 a1 : %d\n", this.a1);
		System.out.printf("멤버변수 a2 : %d\n", this.a2);
	}
}
