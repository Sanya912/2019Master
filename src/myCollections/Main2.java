package myCollections;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
	private static Map<Integer, Location2> locations = new HashMap<Integer, Location2>();
	public static void main(String[] args) {

		
		Scanner scanner = new Scanner(System.in);
		locations.put(0, new Location2(0," In front"));
		locations.put(1, new Location2(1," at the end"));
		locations.put(2, new Location2(2," top a hill"));
		locations.put(3, new Location2(3," Inside the building"));
		locations.put(4, new Location2(4," Beside stream"));
		locations.put(5, new Location2(5," In the forest"));
		
		int loc =1;
		while(true) {
			System.out.println(locations.get(loc).getDescription());
			if(loc==0) {
				break;
			}
			loc =scanner.nextInt();
			if(!locations.containsKey(loc)) {
				System.out.println("You cannot go in tht direction");
			}
		}
	}

}
