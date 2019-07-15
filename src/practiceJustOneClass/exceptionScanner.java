package practiceJustOneClass;

import java.util.Scanner;

public class exceptionScanner {

	static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		inputScanner();
	}

	
	
	
	public static void inputScanner() {
		try {
			
		
		
		System.out.println("Start input: ");
		while(scanner.hasNext()) {
			System.out.println("Enter digits: ");
			scanner.nextInt();
		}
		}catch (Exception e) {
			System.out.println("You entered a letter, please enter a digit: ");
			scanner.next();
			inputScanner();
		}
		
	}
}
