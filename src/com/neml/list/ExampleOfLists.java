package com.neml.list;

import java.util.ArrayList;
import java.util.List;

public class ExampleOfLists {
	
	public static void main(String[] args) {
		
		List<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("C");
		languages.add("C++");
		languages.add("python");
		languages.add("C#");
		languages.add(".Net");
		
		System.out.println("Languages = "+languages);
		
		
		List<String> programmingLan =  new ArrayList<>();
		
		
		System.out.println("programmingLanguage : "+programmingLan);
		
		languages.addAll(programmingLan);
		System.out.println("combine languages : "+programmingLan);
		
		boolean result = programmingLan.contains("smallTalk");
        System.out.println("programmingLan contains smallTalk : " +result);
        
        System.out.println(languages.containsAll(programmingLan));
        System.out.println(programmingLan.containsAll(languages));
        
        boolean equalList = programmingLan.equals(languages);
        
        System.out.println("Both lists are equal : "+equalList);
        
       
		
		
		
	}

}
