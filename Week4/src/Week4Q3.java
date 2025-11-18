import java.util.Scanner;

public class Week4Q3 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Result: ");
		int result = scanner.nextInt();
		scanner.close();
		int id = result>>6;
		int clas = (id<<4)^(result>>2);
		//int clas = (result ^ id<<6)>>2;
		int grade = result ^ (id<<6 | clas<<2); 
		System.out.printf("ID: %d\n", id);
		System.out.printf("Class: %d\n", clas);
		System.out.printf("Grade: %d\n", grade);
	}
}
