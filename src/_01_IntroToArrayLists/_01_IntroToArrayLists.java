package _01_IntroToArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
ArrayList <String> cars= new ArrayList<String>();
		//2. Add five Strings to your list
		cars.add("Farrerri");
		cars.add("Frod");
		cars.add("Handa");
		cars.add("WMB");
		cars.add("2001 Pontiac Aztec");
		//3. Print all the Strings using a standard for-loop
		for (int i = 0; i < cars.size(); i++) {
			String p = cars.get(i);
			System.out.println(p);
		}
		
		//4. Print all the Strings using a for-each loop
		for (String c : cars) {
			System.out.println(c);
		}
		//5. Print only the even numbered elements in the list.
	    for (int i = 0; i < cars.size(); i+=2) {
			String p = cars.get(i);
			System.out.println(p);
		}
		//6. Print all the Strings in reverse order.
		for (int i = cars.size()-1; i >= 0; i--) {
			String p = cars.get(i);
			System.out.println(p);
		}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < cars.size(); i++) {
		if (cars.get(i).contains("e")) {
			System.out.println(cars.get(i));
		}
		}
	}
}
