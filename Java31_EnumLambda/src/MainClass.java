import java.util.function.IntBinaryOperator;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		int r1 = Operation.PLUS.apply(100,3);
		int r2 = Operation.MINUS.apply(100,3);
		int r3 = Operation.TIMES.apply(100,3);
		int r4 = Operation.DIV.apply(100,3);
		System.out.printf("r1 : %d\n", r1);
		System.out.printf("r2 : %d\n", r2);
		System.out.printf("r3 : %d\n", r3);
		System.out.printf("r4 : %d\n", r4);
	}

}

//enum Operation{
//	PLUS{
//		public int apply(int x, int y) {
//			return x+y;
//		} 
//	},
//	MINUS{
//		public int apply(int x, int y) {
//			return x-y;
//		} 
//	},
//	TIMES{
//		public int apply(int x, int y) {
//			return x*y;
//		} 
//	},
//	DIV{
//		public int apply(int x, int y) {
//			return x/y;
//		} 
//	};
//	
//	public abstract int apply(int x, int y);
//}

enum Operation{
	PLUS((x,y)->x+y),
	MINUS((x,y)->x-y),
	TIMES((x,y)->x*y),
	DIV((x,y)->x/y);
	
	// 람다함수를 관리하는 객체
	// IntBinaryOperator : int 두 개를 받아 정수값 하나를 반환하는 람다를 의미한다.
	// LongBinaryOperator : long 두 개를 받아 long값 하나를 반환하는 람다를 의미한다.
	// DoubleBinaryOperator : Double 두 개를 받아 Double값 하나를 반환하는 람다를 의미한다.
	
	// enum의 생성자
	// 상수 정의시 전달 받은 연산 함수를 f 필드에 저장한다.
	// 주의 enum 생성자는 항상 private, 생략해도 private이다.
	private final IntBinaryOperator f;
	
	private Operation(IntBinaryOperator f) {
		this.f = f;
	} 
	
	
	// 외부에서 연산을 수행할 때 호출하는 메서
	// 내부에 저장된 f(람다 함수)를 실행하여 결과를 반환한다.
	public int apply(int x, int y) {
		return f.applyAsInt(x,y);
	}
}






