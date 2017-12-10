public class Array {
	public static void main(String[] args) {
		String[] a = new String[5];

		a[0] = "hi";
		a[1] = "bye";
		a[2] = "parth";
		a[3] = "krish";
		a[4] = "moreparth";

		printArray(a);
	}

	public static void printArray(String[] arrayToBePrinted) {
		for(int i = 0; i < arrayToBePrinted.length; i++) {
			System.out.println(arrayToBePrinted[i]);
		}
	}
}
