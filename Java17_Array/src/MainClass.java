
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 배열을 정의한다.
		// 정수형 기억장소 10개를 관리하는 배열을 생성한다.
		int[] a1 = new int[10];
		int a2 [] = new int[10];
		
		// 배열이 관리하는 기억장소의 개수
		System.out.printf("a1의 개수 : %d\n", a1.length);
		
		// 배열의 생성과 동시에 값을 지정한다.
		// 지정한 값의 개수 만큼 기억장소가 생성되고 이 기억장소들을 관리한다.
		int[] a3 = {1,2,3};
		System.out.printf("a3의 개수 : %d\n", a3.length);
		System.out.printf("a3 : %s\n", a3); // 배열 출력
		
		// 배열이 가지고 있는 기억장소를 사용한다.
		a3[0] = 10;
		System.out.printf("a3[0] : %d\n", a3[0]);
		
		for(int i = 0; i<a3.length; i++) {
			System.out.printf("a3[%d] = %d\n", i, a3[i]);
		}
		
		// 배열이 가지고 있는 기억장소의 개수 만큼 반복한다.
		// 각 반복 회차에 해당하는 기억장소의 값을 추출하여 변수에 담아준다.
		// 몇 번째 반복인지 몰라도 될 경우 사용하면 되고
		// 만약 몇 번째 반복인지 알아야 한다면 위의 for문을 사
		for(int v1 : a3) {
			System.out.printf("v1 : %d\n", v1);
		}
		
		int[][] a4 = new int[3][5];
		int[] a5 [] = new int[3][5];
		int a6 [][] = new int[3][5];
		
		System.out.printf("a4의 개수 : %d\n", a4.length);
		System.out.printf("a4[0]의 개수 : %d\n", a4[0].length);
		
		int[][] a7 = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i = 0; i<a7.length; i++) {
			for(int j = 0; j<a7[i].length; j++) {
				System.out.println(a7[i][j]);
			}
		}
	}

}
