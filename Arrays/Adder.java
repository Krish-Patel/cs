import java.util.Scanner;
public class Adder {
	public static void main(String[] args) {
		System.out.println("How many ints?");
		Scanner scan = new Scanner(System.in);

		int size = scan.nextInt();

		int[] k = new int[size];

		for(int i = 0; i < size; i++){
			System.out.println("Enter #" + i);

			k[i] =  scan.nextInt();
		}

		int total = 0;
		for(int i = 0; i < size; i++){
			total = k[i]+total;
		}

		System.out.println (total);
	}
}