
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Inter1 inter1 = (a1, a2)->a1+a2;
		int r1 = inter1.add(100, 200);
		System.out.printf("r1 : %d\n", r1);
		
		//Inter2 inter2 = (a1, a2)->a1+a2; // 오류
		
		Inter3 inter3 = (a1, a2)-> a1+a2;
		int r3 = inter3.add(100, 200);
		int r4 = inter3.min(100, 200);
		int r5 = Inter3.multi(100, 200);
		System.out.printf("r3 : %d\n", r3);
		System.out.printf("r4 : %d\n", r4);
		System.out.printf("r5 : %d\n", r5);
		
	}

}

// 함수가 하나만 있으므로 함수형 인터페이스가 될 수 있다.
interface Inter1{
	int add(int x, int y);
}

// 추상 메서드가 두 개 이상 있으면 함수형 인터페이스가 될 수 없다.
// 오류 
interface Inter2{
	int add(int x, int y);
	int minus(int x, int y);
}

// 추상 메서드는 하나지만 다른 것들이 포함되어 있는 인터페이스
// 다른 것들이 존재하느냐에 관계없이 추상 메서드가 하나라면 함수형 인터페이스가 될 수 있다.
interface Inter3{
	int add(int x, int y);
	
	default int min(int x, int y) {
		return x-y;
	}
	static int multi(int x, int y) {
		return x*y;
	}
}

// 추상메서드가 하나만 있으므로 컴파일 시 오류가 발생하지 않는다.
@FunctionalInterface
interface Inter4{
	int add(int x, int y);
}
// 추상메서드가 2개 이상 있으므로 컴파일 시 오류가 발생한다.
@FunctionalInterface
//interface Inter5{
//	int add(int x, int y);
//	int minus(int x, int y);
//}

