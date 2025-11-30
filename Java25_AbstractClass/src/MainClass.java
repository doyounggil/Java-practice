
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 추상 클래스를 통한 객체 생성
		// 추상 클래스는 객체 생성이 불가능하다.
		//SuperClass s1 = new SuperClass(); // 오류 
		
		SubClass sub1 = new SubClass();
		sub1.sayHi();
	}
}
 
// 추상 클래스
abstract class SuperClass{
	
	// 추상 메서드
	public abstract void sayHi();
}

// 추상클래스를 상속받는 클래스
class SubClass extends SuperClass{

	@Override
	public void sayHi() {
		System.out.println("안녕하세요");
		
	}
	
}