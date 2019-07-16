package practiceJustOneClass;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class reGex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String name = "Alexander";
		System.out.println(name.replaceAll("[Ax]", "ll"));
		String story = "My cat Zhylik is the best cat in the world";
		System.out.println(story);
		System.out.println(story.replaceAll("[A-d]", "RePP"));
		System.out.println(story.replaceAll("Zhylik", "RRRRRRR"));
		
		String thirdString = "abcDeeeF12Ghhiiiijk99zabcDeee"; //*******************************************************************
		System.out.println(thirdString.replaceAll("^abcDe{3}", "YYY")); //, ^ first match,   e{3} = eee
		System.out.println(thirdString.replaceAll("^abcDe+", "YYY")); // + can replace all letters before + sign
		System.out.println(thirdString.replaceAll("^abcDe*", "YYY")); // * can replace all letters before * sign but will be matching even if eee deleted
		System.out.println(thirdString.replaceAll("^abcDe{2,5}", "YYY")); //{2,5} =={2,4},=={2,6} if e = 4, 5, 6
		System.out.println(thirdString.replaceAll("h+i*j", "Y")); //replace duplicated h and i (together)
		
		//*****************************************************************************************************************************************
		StringBuilder htmlText = new StringBuilder("<h1>My Heading</h1>");
		htmlText.append("<h2>Sub-heading</h2>");
		htmlText.append("<p>This is a paragraph  about something</p>");
		htmlText.append("<p>This is another paragraph about something else.</p>");
		htmlText.append("<h2>Summary</h2>");
		
		//String h2Pattern = ".*<h2>.*";
		String h2Pattern = "(h2)";
		//String h2Pattern = "<h2>";
		Pattern pattern = Pattern.compile(h2Pattern, Pattern.CASE_INSENSITIVE);
		Matcher matcher = pattern.matcher(htmlText);
		System.out.println(matcher.matches());
		
		matcher.reset(); //did not work while with out this line
		int count =0;
		while(matcher.find()) {
			count++;
			System.out.println("Occurrence " + count + " : " + matcher.start() + " to " + matcher.end());
			
		}
		
		//String h2GroupPattern = "(<h2>)";
		String h2GroupPattern = "(<h2>.*?</h2>)";
		Pattern groupPattern = Pattern.compile(h2GroupPattern);
		Matcher groupMatcher = groupPattern.matcher(htmlText);
		System.out.println(groupMatcher.matches());
		groupMatcher.reset();
		
				while(groupMatcher.find()) {
					System.out.println("Occurence: " + groupMatcher.group(1));
					
					
					
					
				}
				
				System.out.println("harry".replaceAll("[H|h]arry", "Larry"));
				System.out.println("Harry".replaceAll("[H|h]arry", "Larry"));
				
				//String h2TextGroupss = "(<h2>(.+?)(</h2>)";

/*				String h2TextGroupss = "(<h2>.*?(</h2>)";
				Pattern h2TextPatten = Pattern.compile(h2TextGroupss); //h2GroupPattern   //h2TextGroupss
				Matcher h2TextMatcher = h2TextPatten.matcher(htmlText);
				h2TextMatcher.reset();
				
				while(h2TextMatcher.find()) {
					System.out.println("Occurence: " + h2TextMatcher.group(2));
				}*/
		
		
				// [^abc]    //^ = ! not equal
				String tvTest = "tstvtkt";
				String tNotVRegExp = "t[^v]";  //not equal ^v 
			//	String tNotVRegExp = "(?!v)"; //line by line in output
				//String tNotVRegExp = "t(?=v)"; //found v letter from 2 to 3
				Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
				Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);
				
				count =0;
				while(tNotVMatcher.find()) {
					count++;
					System.out.println("Occurence " + count + " : " + tNotVMatcher.start() + " to " + tNotVMatcher.end());
				}
				
				//**************************new**************************************
				String phone1 = "1234567890"; //not
				String phone2 = "(123) 456-7890"; //yes
				String phone3 = "123 456-7890"; //not
				String phone4 = "(123)456-7890";  //not
				
				System.out.println("phone1 = " + phone1.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
				System.out.println("phone2 = " + phone2.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$")); //true
				System.out.println("phone3 = " + phone3.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
				System.out.println("phone4 = " + phone4.matches("^([\\(]{1}[0-9]{3}[\\)]{1}[ ]{1}[0-9]{3}[\\-]{1}[0-9]{4})$"));
				
		
		
		
	}

}
