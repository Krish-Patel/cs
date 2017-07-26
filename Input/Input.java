	import java.util.Scanner;

	public class Input{
		public static void main(String[] args){
			System.out.println("enter your name") ;

			Scanner scan =new Scanner(System.in);
			String name = scan.nextLine();

			System.out.println("Hello, " + name) ;


		}
	}