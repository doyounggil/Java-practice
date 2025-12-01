
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Inter1 inter1 = (a1, a2)->a1+a2;
		int r1 = inter1.calc(100, 200);
		System.out.printf("r1 : %d\n", r1);
		
		Inter1 inter2 = (a1, a2)->a1+a2;
		// test1을 호출할 때 람다식을 전달한다.
		int r2 = test1(inter2);
		System.out.printf("r2 : %d\n", r2);
		
		int r3 = test1((a1, a2)->a1+a2);
		System.out.printf("r3 : %d\n", r3);
		
		// 메서드를 호출하여 람다식을 받는다.
		Inter1 inter3 = test2();
		int r4 = inter3.calc(100, 3);
		System.out.printf("r4 : %d\n", r4);
		
	}
	
	public static int test1(Inter1 inter1) {
		return inter1.calc(100,3);
	}
	
	public static Inter1 test2() {
		return (a1,a2)->a1+a2;
	}
	
}


@FunctionalInterface
interface Inter1{
	int calc(int x, int y);
}