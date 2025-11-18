import java.util.Scanner;

public class Week4Q2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("ID (0~65535): ");
		int id = scanner.nextInt();
		System.out.print("Class (0~15): ");
		int clas = scanner.nextInt();
		System.out.print("Grade (0~3): ");
		int grade = scanner.nextInt();
		scanner.close();
		int result = id<<6 | clas<<2 | grade;
		System.out.printf("Result: %d", result);
	}
}
