package practiceJustOneClass;

public class reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		String s = "hello people";
		
		for(int i=s.length()-1; i>=0; i--) {
			//System.out.print(s.charAt(i));
			System.out.print(s.toUpperCase().charAt(i));
		}
	}

}
