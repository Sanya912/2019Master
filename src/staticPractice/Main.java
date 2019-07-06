package staticPractice;

public class Main {

	public static void main(String[] args) {
		
		StaticTest first = new StaticTest("1st instance");
		System.out.println(first.getName() + " is instance number: " + StaticTest.getNumInstances());
		
		StaticTest second = new StaticTest("2d instance");
		System.out.println(second.getName() + " is instance number: " + StaticTest.getNumInstances());
		
		StaticTest third = new StaticTest("3d instance");
		System.out.println(third.getName() + " is instance number: " + StaticTest.getNumInstances());

	}

}
