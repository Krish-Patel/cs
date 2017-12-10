public class FunctionTest {
	public static void main(String[] args) {
		System.out.println(min(1000, 999));
	}

	//f(a, b) = a * b
	public static int f(int a, int b) {
		return a * b;
	}

	public static int min(int a, int b) {
		if (a<b){
			return a;
		}

		return b;
	
	}

	public static int min2(int a, int b, int c) {
		return min(min(a, b), min(b,c));
	
	}
}