
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		TestClass1 t1 = new TestClass1();
		// 메서드를 호출한다.
		t1.testMethod1();
		t1.testMethod2();
		
		int r1 = t1.testMethod3();
		double r2 = t1.testMethod4();
		System.out.printf("r1 : %d\n", r1);
		System.out.printf("r2 : %f\n", r2);
		
		// 매개변수를 가지고 있는 메서드를 호출한다.
		// 정의된 매개변수의 개수와 동일한 개수의 값을 전달해야 한다.
		// 전달한 값의 순서대로 매개변수에 담기게 되기 때문에 타입도 같아야 한다.
		t1.testMethod5(100, 11.11);
		t1.testMethod5(100, 200);
		// t1.testMethod5(15.11, 11.11);
		
		int r3 = t1.testMethod6(100,100);
		int r4 = t1.testMethod6(100,200, 300);
		double r5 = t1.testMethod6(11.11,22.22);
		System.out.printf("r3 : %d\n", r3);
		System.out.printf("r4 : %d\n", r4);
		System.out.printf("r5 : %f\n", r5);
		
		
	}
}

class TestClass1{
	public void testMethod1() {
		System.out.printf("testMethod1을 호출하였습니다.\n");
	}
	
	public void testMethod2() {
		System.out.printf("testMethod2을 호출하였습니다.\n");
	}
	
	public int testMethod3() {
		// 필요한 처리를 구현
		// 처리를 통해 얻은 값을 반환
		return 100;
	}
	
	public double testMethod4() {
		return 11.11;
	}
	
	// 매개변수를 가진 메서드 
	// 매개변수를 필요한 만큼 만들어주면 된다.
	public void testMethod5(int v1, double v2) {
		System.out.println("testMethod5를 호출하였습니다.");
		System.out.printf("v1 : %d\n", v1);
		System.out.printf("v2 : %f\n", v2);
	}
	
	// 메서드 오버로딩(Overloading)
	public int testMethod6(int v1, int v2) {
		System.out.println("testMethod6-1 호출");
		return v1+v2;
	}
	public int testMethod6(int v1, int v2, int v3) {
		System.out.println("testMethod6-2 호출");
		return v1+v2+v3;
	}
	public double testMethod6(double v1, double v2) {
		System.out.println("testMethod6-3 호출");
		return v1+v2;
	}
}
