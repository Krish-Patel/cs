import java.util.Scanner;

public class Input{
	public static void main(String[] args){
		System.out.println("enter your name") ;

		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();

		if (name.equals ("Krish")){
				System.out.println("Welcome to spinjitzu") ;
		} else if (name.equals ("Parth")){
				System.out.println("Welcome to spinjitzu") ;

		} else if (name.equals ("Dylan")){

				System.out.println("Welcome to spinjitzu") ;
		} else if (name.equals ("Shaylan")){
				System.out.println("Welcome to spinjitzu") ;
		} else {
			System.out.println("Hello, " + name) ;

		}
	}
}