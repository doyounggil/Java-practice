import java.util.Scanner;

public class Week4Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Operand 1: ");
		int op1 = scanner.nextInt();
		System.out.print("Operator(+, - ,*, /, %): ");
		String oper = scanner.next();
		System.out.print("Operand 2: ");
		int op2 = scanner.nextInt();
		scanner.close();
		
		switch(oper) {
			case "+":
				System.out.printf("%d + %d = %d", op1, op2, op1+op2);
				break;
			case "-":
				System.out.printf("%d - %d = %d", op1, op2, op1-op2);
				break;
			case "*":
				System.out.printf("%d * %d = %d", op1, op2, op1*op2);
				break;
			case "/":
				if(op2 ==0) {
					System.out.println("Error: Cannot divide by zero");
					break;
				}
				System.out.printf("%d / %d = %d", op1, op2, op1/op2);
				break;
			case "%":
				if(op2 ==0) {
					System.out.println("Error: Cannot divide by zero");
					break;
				}
				System.out.printf("%d %% %d = %d", op1, op2, op1%op2);
				break;
			default:
				System.out.println("Error: Invalid operator");
				break;
				
		}

	}

}
