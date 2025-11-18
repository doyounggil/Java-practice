import java.util.Scanner;

public class Week4Q1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("n: ");
		int n = scanner.nextInt();
		System.out.print("Max value of the range: ");
		int max = scanner.nextInt();
		scanner.close();
		int sum = 0;
		int multi = 0;
		for(int i = 1; i<=max/n; i++) {
			multi = n*i;
			sum += multi;
		}
		System.out.printf("Sum: %d", sum);
	}
}
