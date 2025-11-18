
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestClass1 t1 = new TestClass1();
		TestClass2 t2 = new TestClass2();
		TestClass3 t3 = new TestClass3(100);
		
		new TestClass4();
		new TestClass4(100);
		new TestClass4(100,200);
		new TestClass4(11.11);
	}
}

class TestClass1{
	// 생성자  
	public TestClass1(){
		System.out.println("생성자 호출");
	}
}


// 생성자를 작성하지 않은 클래스
// 자동으로 매개변수가 없는 생성자가 추가된다.
class TestClass2{
	
}
class TestClass3{
	// 매개변수가 있는 생성자
	// 생성자를 작성하면 매개변수가 없는 생성자가 자동으로 추가되지 않는다.
	public TestClass3(int a1) {
		System.out.println("TestClass3의 생성자 호출");
		System.out.printf("a1 : %d\n", a1);
	}
}

// 생성자의 오버로딩
// 매개변수의 형태를 다르게하여 여러 생성자를 만들 수 있다.
class TestClass4{
	public TestClass4() {
		System.out.println("TestClass4의 매개변수가 없는 생성");
	}
	public TestClass4(int a1) { 
		// 만약 다른 생성자를 호출하겠다면 this를 사용한다.
		// 생성자에서 다른 생성자를 호출하는 코드는 생성자 내부에서 가장 위에 있어야 한다.
		this(1000, 2000);
		System.out.println("TestClass4의 정수형 매개변수가 1개 있는 생성");
	}
	public TestClass4(int a1, int a2) {
		System.out.println("TestClass4의 정수형 매개변수가 2개 있는 생성");
	}
	public TestClass4(double a1) {
		System.out.println("TestClass4의 실수형 매개변수가 1개 있는 생성");
	}
}