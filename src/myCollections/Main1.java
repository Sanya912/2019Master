package myCollections;

import java.util.HashMap;
import java.util.Map;

public class Main1 {

	public static void main(String[] args) {
		Map<String, String> languages = new HashMap<>();
		if(languages.containsKey("Java" )) {
			System.out.println("Java already exist");
		} else {
			languages.put("Java", " a compliled high level, object-oriented, platform independent language");
			System.out.println("Java added successfully");
		}
		
		languages.put("Python", " an interpreted,  object-oriented, high-level programming language with dynamic semantics");
		languages.put("Algog", "an algoritm language");
		System.out.println(languages.put("BASIC", "Beginners code"));
		System.out.println(languages.put("Lisp", " Madness"));
		
		if(languages.containsKey("Java")) {
			System.out.println("Already in the map");
		}else {
			languages.put("Java", " this course is about Java");
			
		}
		
		System.out.println("==========================");
		//languages.remove("Lisp");
		if(languages.remove("Algog", "an algoritm language")){
			System.out.println("Algol removed");
		}else {
			System.out.println("Algol not removed, key/value pair not found");
		}
		
		if(languages.replace("Python", " an interpreted,  object-oriented, high-level programming language with dynamic semantics", "updated Java")) {
			System.out.println("Updated Java");
		}
		for(String key: languages.keySet()) {
System.out.println(key + " : " + languages.get(key));
		}
	}

}
