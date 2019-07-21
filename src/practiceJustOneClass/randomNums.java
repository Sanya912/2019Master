package practiceJustOneClass;

import java.util.regex.Matcher;

public class randomNums {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int ran = (int) (Math.random() * 1000000);
		System.out.println(ran);
		int i=0;
		while(i<5) {
			System.out.println(i);
			i++;
		}
	}

}
