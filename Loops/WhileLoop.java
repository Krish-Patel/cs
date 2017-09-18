import java.util.Scanner;

public class WhileLoop {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		boolean isVader = false;
		while(isVader == false) {
			System.out.println("Who are you?");
			String input = scan.nextLine();
			if (input.equalsIgnoreCase("vader")) {
				isVader = true;
			} else {
				System.out.println("Unauthorized Access.");
			}
		}

		System.out.println("Access Granted.");
	}
}
