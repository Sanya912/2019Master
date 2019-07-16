package practiceJustOneClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reGex1 {

	public static void main(String[] args) {
		String challenge1 = "I want a bike.";
		String challenge2 = "I want a ball.";
		
		System.out.println(challenge1.matches("I want a bike."));
		
		String regEXp = "I want a \\w+.";   //match bike and ball
		
		System.out.println(challenge1.matches(regEXp));
		System.out.println(challenge2.matches(regEXp));
		
		String regExp1 = "I want a (bike|ball).";
		System.out.println(challenge1.matches(regExp1));
		System.out.println(challenge2.matches(regExp1));
		
		
		//***********************************************
		String regEXp3 = "I want a \\w+.";
		Pattern pattern = Pattern.compile(regEXp3);
		Matcher matcher = pattern.matcher(challenge1);
		System.out.println(matcher.matches());
		matcher = pattern.matcher(challenge2);
		System.out.println(matcher.matches());
	}

}
