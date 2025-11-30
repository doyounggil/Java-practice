
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Class1 t1 = new Class1();
		// final 변수의 값을 사용하는 것은 가능하다.
		System.out.printf("a1 : %d\n", t1.a1);
		// final 변수의 값은 변경이 불가능하다.
		t1.a1 = 200; // 오
		
		
	}

}

class Class1 {
	// final 변수
	// 값을 변경하지 못한다.
	final int a1 = 100;
}

class Class2 {
	
	public void method1() {
		System.out.println("일반 메서드");
	}
	
	public final void method2() {
		System.out.println("final 메서드");
	}
}

class Class3 extends Class2 {
	// 일반 메서드 overriding
	@Override
	public void method1() {
		System.out.println("Overriding");
	}
	// final 메서드 overriding
	// final 메서드는 overriding이 불가능하다.
	public final void method2() { // 오류 
		System.out.println("Overriding");
	}
}

final class Class4{
	
}

// final class 상속
// final class는 상속 받을 수 없다.
class Class5 extends Class4{ // 오류
	
}


