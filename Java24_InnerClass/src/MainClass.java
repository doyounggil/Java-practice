
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 일반 중첩클래스의 객체를 생성한다.
		// inner class의 객체를 생성하기 위해서는 outer class의 객체가 필요하다.
		OuterClass1 outer1 = new OuterClass1();
		OuterClass1.InnerClass1 inner1 = outer1.new InnerClass1();
		
		// inner class의 멤버 접근
		System.out.printf("inner1.innerA1 : %d\n", inner1.innerA1);
		inner1.innerMethod1();
		
		// OuterClass1에 정의한 멤버는 InnerClass의 멤버가 아니다.
		// 상속관계가 아니기 때문이다.
		//System.out.printf("inner1.outerA1 : %d\n", inner1.outerA1);
		//inner1.outerMethod1();
		
		// static 중첩 클래스의 객체를 생성한다.
		// Outer의 객체 없이 바로 생성한다.
		OuterClass2.InnerClass2 inner2 = new OuterClass2.InnerClass2();
		inner2.innerMethod2();
		
		// 지역 중첩 클래스 사용
		TestClass100 t100 = new TestClass100();
		t100.testMethod1();
		
		SubClass100 sub100 = new SubClass100();
		sub100.superMethod100();
		
		// 익명 중첩 클래스 사용
		// SuperClass100을 상속받는 클래스를 만든다.
		// 메서드를 overriding 한다.
		// 이 클래스를 가지고 객체를 생성하여 super100에 담아준다.
		SuperClass100 super100 = new SuperClass100() {
			@Override
			public void superMethod100() {
				super.superMethod100();
				System.out.println("익명 중첩 클래스 - superMethod100");
			}
		};
		super100.superMethod100();
		
		SuperClass100 c = new SuperClass100();
		c.superMethod100();
	}

}

// 일반 중첩 클래스
// 특정 클래스가 다른 클래스의 멤버를 자주 사용하는 상황
// 특정 클래스가 다른 곳에서는 잘 쓰여지지 않는 상황
// 일반 중첩 클래스를 권장한다.
class OuterClass1{
	
	int outerA1 = 100;
	
	public void outerMethod1() {
		System.out.println("outerMethod1");
	}
	
	// Outer에서 Inner 사용
	// Outer의 객체만 생성하고 Inner는 생성하지 않을 수 있기 때문에
	// Outer에서 Inner의 멤버를 사용하는 것은 불가능하다. 
	// public void outerMethod2() {
	// 	System.out.printf("innerA1 : %d\n", innerA1); // 오류
	//	innerMethod(); // 오류
	//}
	
	
	class InnerClass1{
		int innerA1 = 200;
		
		public void innerMethod1() {
			System.out.println("innerMethod1");
		}
		// Inner Class에서 Outer의 멤버 접근
		// Inner Class의 객체를 생성하기 위해서는 OuterClass의 객체가 필요하다.
		// 이에 Inner Class는 OuterClass의 멤버를 사용할 수 있다.
		public void innerMethode2() {
			System.out.printf("outerA1 : %d\n", outerA1);
			outerMethod1();
		}
	}
}

// static 중첩 클래스
  
class OuterClass2{
	
	int outerMemberA1 = 100;
	static int outerMemberA2 = 200;
	
	static class InnerClass2{
		public void innerMethod2() {
			System.out.println("InnerClass2 - innerrMethod2");
			// Outer의 일반 멤버 변수는 사용할 수 없다. - 객체가 생성되어 있다는 것을 보장받을 수 없기 때문이다.
			// System.out.printf("outerMemberA1 : %d\n", outerMemberA1); // 오류 
			System.out.printf("outerMemberA2 : %d\n", outerMemberA2);
		}
	}
}

// 지역 중첩 클래스
// 메서드 내부에서 만드는 클래
// 메서드 내부에서만 객체 생성이 가능하고
// 메서드가 끝나면 소멸하기 때문에 다른 곳에서는 변수 조차 생성할 수 없다. 
class TestClass100{
	public void testMethod1() {
		// 지역 중첩 클래스 
		class InnerClass3{
			int innerMemberA1 = 100;
		}
		InnerClass3 inner3 = new InnerClass3();
		System.out.printf("inner3.innerMemberA1 : %d\n", inner3.innerMemberA1);
	}
	
	public void testMethod2() {
		// testMethod1에서 정의한 클래스이므로 사용이 불가능하다.
		//InnerClass3 inner3 = new InnerClass3();
		//System.out.printf("inner3.innerMemberA1 : %d\n", inner3.innerMemberA1);
	}
}


class SuperClass100{
	public void superMethod100() {
		System.out.println("SuperClass100 - superMethod100");
	}	
}

class SubClass100 extends SuperClass100{
	
	@Override
	public void superMethod100() {
		super.superMethod100();
		System.out.println("SubClass100 - superMethod100");
	}
}
