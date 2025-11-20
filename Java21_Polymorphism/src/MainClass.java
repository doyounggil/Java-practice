
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// SubClass 타입 변수
		SubClass sub1 = new SubClass();
		sub1.subV1 = 100;
		sub1.superV1=200;
		
		System.out.printf("sub1.subV1 : %d\n", sub1.subV1);
		System.out.printf("sub1.superV1 : %d\n", sub1.superV1);
		
		// 부모 타입(SuperClass) 변수
		SuperClass super1 = new SubClass();
		super1.superV1 = 300;
		System.out.printf("super1.superV1 : %d\n", super1.superV1);
		
		// 부모 타입 변수를 통해 객체에 접근하면 부모로 부터 물려 받은 것만 사용이 가능하다.
		// super1.subV1 = 400;
		
		TestClass t1 = new TestClass();
		// SuperClass 타입 객체를 전달한다.
		SuperClass super100 = new SuperClass();
		super100.superV1 = 100;
		t1.showSuperV1(super100);
		
		// SuperClass를 상속받은 타입 객체를 전달한다.
		SubClass sub100 = new SubClass();
		sub100.superV1 = 200;
		t1.showSuperV1(sub100);
		
		SubClass2 sub2000 = new SubClass2();
		SubClass2 sub2001 = new SubClass2(100);
		
		SuperClass3 super3000 = new SubClass3();
		super3000.superMethod3();
	}

}

class SuperClass{
	int superV1;
	
}

class SubClass extends SuperClass{
	int subV1;
}

class TestClass{
	
	public void showSuperV1(SuperClass super1) {
		System.out.printf("super1.superV1 : %d\n", super1.superV1);
	}
}

class SuperClass2{
	
	public SuperClass2() {
		System.out.println("SuperClass2의 기본 생성자");
	}
	
	public SuperClass2(int a1) {
		System.out.println("SuperClass2의 매개변수가 있는 생성자");
	}
	
}
// 클래스의 객체를 생성하면 부모클래스의 생성자가 호출된다.
// 부모의 생성자부터 먼저 호출된다.
class SubClass2 extends SuperClass2{
	// 부모의 생성자 중 어떤 생성자를 호출하겠다고 명시하지 않으면
	// 부모가 가진 생성자 중 매개변수가 "없는" 생성자를 자동으로 호출한다.
	public SubClass2() {
		System.out.println("SubClass2의 기본 생성자");
	}  
	public SubClass2(int a1){
		// 부모의 생성자를 호출한다.
		super(a1); 
		System.out.println("SubClass2의 매개변수가 있는 생성자");
	}
}

class SuperClass3{
	
	public void superMethod3() {
		System.out.println("SuperClass3 - superMethod3");
	}
}

class SubClass3 extends SuperClass3{
	@Override
	public void superMethod3() {
		// 부모의 메서드를 호출하겠다면 super를 사용한다.
		super.superMethod3();
		System.out.println("SubClass3 - superMethod3");
	}
}


