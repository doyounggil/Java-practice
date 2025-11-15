// test.pack1에 있는 PClass1 사용 선언
// 현재 파일에서 PClass1을 사용하면 이 클래스는 test.pack1에 있으니깐
// 패키지 명을 생략하고 사용할 경우 test.pack1에 있는 PClass1을 사용해~
import test.pack1.PClass1;
// 만약 특정 패키지에 있는 모든 클래스를 import 하고자 한다면...
import test.pack2.*;

// 패키지가 다르더라도 같은 이름의 클래스가 이미 import 되어 있다면
// import 시키지 못한다.
// 이럴 경우에는 import을 하지 말고 패키지명을 붙혀서 클래스를 사용해야 한다.
// import test.pack3.PClass1;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PClass1 p1 = new PClass1();
		p1.method1();
		
		// 만약에 import를 하지 않았다면 패키지 명까지 모두 작성해야 한다.
		test.pack1.PClass2 p2 = new test.pack1.PClass2();
		p2.method2();
		
		PClass3 p3 = new PClass3();
		p3.method3();
		
		PClass4 p4 = new PClass4();
		p4.method4();
		
		// PClass1이 test.pack1.PClass1에 이미 import되어 있으므로
		// test.pack3.PClass1은 패키지명을 생략하면 안된다.
		test.pack3.PClass1 p5 = new test.pack3.PClass1();
		p5.method5(); 
	}

}
