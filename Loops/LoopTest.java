import java.util.Scanner;

public class LoopTest {
	public static void main(String args[]) {
		System.out.println("Enter a number");
		Scanner scan = new Scanner(System.in);
		
		int upper= scan.nextInt(); 

		for ( int i = 0;i<upper; i++) {
			for ( int b =0;b<i;b++) {
				System.out.println(b);
			}
		}
	}
}
