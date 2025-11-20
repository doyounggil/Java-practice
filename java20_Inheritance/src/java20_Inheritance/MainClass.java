package java20_Inheritance;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Class2 c2 = new Class2();
		// Class2에 정의되어 있는 멤버를 사용
		c2.v2 = 200;
		System.out.printf("c2.v2 : %d\n", c2.v2);
		c2.method2();
		// 상속 받은 멤버를 사용한다.
		c2.v1 = 100;
		System.out.printf("c2.v1 : %d\n", c2.v1);
		c2.method1();
		
		c2.method3();
	}

}

class Class1{
	int v1;
	
	public void method1() {
		System.out.printf("Class1의 변수 v1 : %d\n", v1);
	}
}

// Class1을 상속받은 클래스 
class Class2 extends Class1{
	int v2;
	
	public void method2() {
		System.out.printf("Class2의 변수 v2 : %d\n", v2);
	}
	// 자식클래스는 부모클래스로 부터 상속 받은 멤버를 사용할 수 있다.
	public void method3() {
		System.out.printf("Class1의 변수 v1 : %d\n", v1);
		method1(); 
	}
}