import java.util.Scanner;

public class Week4Q5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Goal: ");
		int goal = scanner.nextInt();
		int money = 0;
		while(money<=goal) {
			System.out.println("1. Deposit | 2. Withdraw");
			System.out.print("Select a menu: ");
			int menu = scanner.nextInt();
			if(menu==1) {
				System.out.print("Enter amoount to deposit: ");
				int deposit = scanner.nextInt();
				if(deposit<=0) {
					System.out.println("Error: Deposit amount must be positive");
					continue;
				}
				money += deposit;
				System.out.printf("Current Balance: %d\n", money);
				if(money>=goal) {
					System.out.println("Goal achieved!");
					break; // 없어도 된다. 
				}
				
			}
			else if(menu==2) {
				System.out.print("Enter amount to withdraw: ");
				int withdraw = scanner.nextInt();
				if(money<withdraw) {
					System.out.println("Error: Insufficient funds");
					continue;
				}
				else if(withdraw<=0) {
					System.out.println("Error: Withdraw amount must be positive");
					continue;
				}
				money -= withdraw;
				System.out.printf("Current Balance: %d\n", money);
			}
			else {
				System.out.println("Error: Invalid menu");
				continue;
			}
		}
		scanner.close();
	}

}
