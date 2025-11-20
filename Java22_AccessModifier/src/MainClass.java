import com.test.pkg1.KClass;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 같은 패키지의 클래스 - 객체 생성 
		AClass a1 = new AClass();
		a1.publicMethod();
		a1.defaultMethod();
		a1.protectedMethod();
		a1.privateMethod(); // 오류 
		
		// 다른 패키지의 클래스 - 객체 생성  
		KClass k1 = new KClass();
		k1.publicMethod();
		k1.defaultMethod(); // 오류 
		k1.protectedMethod(); // 오류 
		k1.privateMethod(); // 오류 
	}

}
// 같은 패키지의 클래스
class AClass{
	
	public void publicMethod() {
		System.out.println("AClass - public");
	}
	void defaultMethod() {
		System.out.println("AClass - default");
	}
	protected void protectedMethod() {
		System.out.println("AClass - protected");
	}
	private void privateMethod() {
		System.out.println("AClass - private");
	}
	
}
//같은 패키지의 클래스 - 상속 
class BClass extends AClass{
	
	public void testMethod() {
		publicMethod();
		defaultMethod();
		protectedMethod();
		privateMethod(); // 오류
	}
	
}
// 다른 패키지의 클래스 - 상속 
class DClass extends KClass{
	
	public void testMethod() {
		publicMethod();
		defaultMethod(); // 오류
		protectedMethod();
		privateMethod(); // 오류
	}
	
}

