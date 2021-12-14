package test_return_statement;

public class ReturnStatement {

	public static void main(String[] args) {
		printAMessage();
		int sum = add(4, 5);
		System.out.println(sum);
		String shout = caps("lol");
		System.out.println(shout);
		int[] lmaoArray = gimmeArray(2,3,4);
		System.out.println(lmaoArray[0]);
		System.out.println(lmaoArray[1]);
		System.out.println(lmaoArray[2]);
	}

	public static void printAMessage() {
		System.out.println("This is our first method!");
	}

	public static int add(int a, int b) {
		return a + b;
	}

	public static String caps(String s) {
		return s.toUpperCase();
	}
	
	public static int[] gimmeArray(int a, int b, int c) {
		int[] array = new int[3];
		array[0] = a;
		array[1] = b;
		array[2] = c;
		return array;
	}
}
