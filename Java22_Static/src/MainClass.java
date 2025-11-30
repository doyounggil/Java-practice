
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 객체 생성
		TestClass1 t1 = new TestClass1();
		
		System.out.printf("t1.a1 : %d\n", t1.a1); // 객체로도 접근이 가능하다.
		System.out.printf("TestClass1.a1 : %d\n", TestClass1.a1);
		
		t1.a1 = 200;
		
		System.out.printf("t1.a1 : %d\n", t1.a1); // 객체로도 접근이 가능하다.
		System.out.printf("TestClass1.a1 : %d\n", TestClass1.a1);
		
		TestClass1.a1 = 300;
		System.out.printf("t1.a1 : %d\n", t1.a1); // 객체로도 접근이 가능하다.
		System.out.printf("TestClass1.a1 : %d\n", TestClass1.a1);
	}

}

class TestClass1 {
	static int a1 = 100;
	
	public static void method1() {
		System.out.println("method1 호출");
	}
}

class TestClass2{
	static int a1 = 100;
	int b1 = 200;
	
	public static void method1() {
		System.out.println("method1 호출");
	}
	
	public void method2() {
		System.out.println("일반 메서드");
	}
	
	// 일반 메서드에서 static 멤버와 일반 멤버 사용
	// 일반 베서드가 호출이 되었다는 것은 객체가 생성되어 있다라는 의미가 된다.
	// static 멤버들은 클래스가 메모리에 올라갈 때 메모리에 생성되기 때문에
	// 객체 생성전 이미 메모리에 생성되어 있다. 따라서 일반 메서드에서 사용할 수 있다.
	public void method3() {
		System.out.printf("a1 : %d", a1);
		System.out.printf("b1 : %d", b1);
		method1();
		method2();  
	}
	
	// static 메서드에서 static 멤버와 일반 멤버 사용
	// static 메서드가 호출이 될 때 객체가 생성되어 있다라는 것을 보장 받을 수 없다.
	// 그렇기 때문에 객체를 생성해야지만 사용할 수 있는 일반 멤버들은 사용이 불가능하다.
	// 즉 static 메서드에서는 static 멤버만 사용이 가능하다.
	public static void method4() {
		System.out.printf("a1 : %d", a1);
		//System.out.printf("b1 : %d", b1); // 오류 
		method1();
		//method2();  // 오류 
	}
	
}