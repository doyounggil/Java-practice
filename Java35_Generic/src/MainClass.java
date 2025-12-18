
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 타입을 정해주면서 객체를 생성한다.
		TestClass<Integer> t1 = new TestClass<>();
		t1.method1(100);
		
		TestClass<Double> t2 = new TestClass<>();
		t2.method1(11.11);
		
		TestClass2<Integer, String> t3 = new TestClass2<>();
		t3.method2(100, "문자열");
		
		TestClass3<Integer> t4 = new TestClass3<>();
		t4.method3(100);
		
		// TestClass3<String> t4 = new TestClass3<>(); // 오류 
	
		
	}

}

class TestClass<T>{
	public void method1(T a1) {
		System.out.println(a1);
	}
}

class TestClass2<A, B>{
	public void method2(A a1, B a2) {
		System.out.println(a1);
		System.out.println(a2);
	}
}

class TestClass3<T extends Number>{
	public void method3(T a1){
		System.out.println(a1);
	}
}