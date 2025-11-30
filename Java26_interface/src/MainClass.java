
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestClass1 t1 = new TestClass1();
		t1.methodA();
		t1.methodB();
		
		InterA interA = t1;
		interA.methodA();
		
		InterB interB = t1;
		interB.methodB();
		
		TestClass2 t2 = new TestClass2();
		t2.methodA();
		t2.methodB();
		t2.methodC();
		
		InterC interC = t2;
		interC.methodA();
	}

}

// 인터페이스
interface InterA{
	// 추상메서드 
	public void methodA();
	
}

interface InterB{
	// 추상메서드 
	public void methodB();
}

// interface를 상속받은 interface
interface InterC extends InterA, InterB{
	public void methodC();
}


// 인터페이스를 구현한 클래스 
class TestClass1 implements InterA, InterB{

	@Override
	public void methodA() {
		System.out.println("TestClass1의 methodA");
	}
	
	@Override
	public void methodB() {
		System.out.println("TestClass1의 methodB");
	}
	
}

// 인터페이스를 상속받은 인터페이스 구현
class TestClass2 implements InterC{

	@Override
	public void methodA() {
		System.out.println("TestClass2의 methodA");
		
	}

	@Override
	public void methodB() {
		System.out.println("TestClass2의 methodB");
		
	}

	@Override
	public void methodC() {
		System.out.println("TestClass2의 methodC");
		
	}
	
}
