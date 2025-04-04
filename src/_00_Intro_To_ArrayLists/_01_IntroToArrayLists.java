package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	ArrayList<String> strings = new ArrayList<String>();

        // 2. Add five Strings to your list
    	strings.add("1");
    	strings.add("2");
    	strings.add("3");
    	strings.add("4");
    	strings.add("5");

        // 3. Print all the Strings using a standard for-loop
    	for(int i = 0; i < strings.size(); i++) {
    		System.out.println(strings.get(i));
    	}

        // 4. Print all the Strings using a for-each loop
    	for(String s: strings) {
    		System.out.println(s);
    	}
        // 5. Print only the even numbered elements in the list.
    	for(int i = 0; i < strings.size(); i++) { 
    		if(i % 2 == 0) {
    			System.out.println(strings.get(i));
    		}
    	}
        // 6. Print all the Strings in reverse order.
    	for(int i = 0; i < strings.size(); i++) {
    		System.out.println(strings.get(strings.size() - i));
    	}
        // 7. Print only the Strings that have the letter 'e' in them.
    	for(int i = 0; i < strings.size(); i++) {
    		if(strings.get(i).contains("e")) {
    			System.out.println(strings.get(i));
    		}
    	}
        
    }
}
