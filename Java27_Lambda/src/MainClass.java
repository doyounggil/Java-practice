
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 익명 중첩 클래스
		Inter1 inter1 = new Inter1() {

			@Override
			public int add(int x, int y) {
				// TODO Auto-generated method stub
				return x+y;
			}
		};
		int r1 = inter1.add(100,200);
		System.out.printf("r1 : %d\n", r1);
		
		// 람다
		Inter1 inter2 = (int a1, int a2) -> {
			return a1+a2;
		};
		int r2 = inter2.add(100, 200);
		System.out.printf("r2 : %d\n", r2);
		
		// 인터페이스에 있는 추상 메서드의 매개변수 형태를 보고 매개변수의 타입을 
		// 알 수 있기 때문에 매개변수 타입을 생략할 수 있다.
		Inter1 inter3 = (a1,a2)->{
			return a1+a2;
		};
		int r3 = inter3.add(100, 200);
		System.out.printf("r3 : %d\n", r3);
		
		// 만약 { } 안의 코드가 한 줄 밖에 없고 계산된 값을 반환한다면
		// { }와 return을 생략할 수 있다.
		Inter1 inter4 = (a1,a2)->a1+a2;
		int r4 = inter4.add(100, 200);
		System.out.printf("r4 : %d\n", r4);
	}
}

// 인터페이스
interface Inter1{
	// 추상메서드
	int add(int x, int y);
}