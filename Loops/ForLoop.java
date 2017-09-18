import java.util.Scanner;

public class ForLoop {
	public static void main(String args[]) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		
		int lower= scan.nextInt(); 

		System.out.println("Enter a number");
		
		int upper= scan.nextInt(); 

		for (int i = lower; i < upper; i++) {
			System.out.println(i);
		}
	}
}
