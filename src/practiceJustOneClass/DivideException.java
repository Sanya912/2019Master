package practiceJustOneClass;

import java.util.Scanner;

public class DivideException {

	public static void main(String[] args) {
		int result = divide();
		System.out.println("***************************\n" +result);
	}
	
	private static int divide() {
		int x=getInt();
		int y = getInt();
		System.out.println("x = " + x + ", y = " + y);
		return x/y;
	}
	
	private static int getInt() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter an integer: ");
		return scanner.nextInt();
	}

}
