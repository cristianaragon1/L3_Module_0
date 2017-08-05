package IntroToArrayLists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		ArrayList<String> array = new ArrayList<>();
		//   Don't forget to import the ArrayList class
		
		//2. Add five Strings to your list
		array.add("String one");
		array.add("String two");
		array.add("String three");
		array.add("String four");
		array.add("String five");
		//3. Print all the Strings using a standard for-loop
	
		
	//	for (String e:array) {
		//	System.out.println(e);
		//}
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		//for (int i = 0; i < array.size(); i+=2) {
		//	System.out.println(i);
		//}
		//6. Print all the Strings in reverse order.
		//for (int i = 4; i >=0; i--) {
		//	System.out.println(i);
		//}
		//7. Print only the Strings that have the letter 'e' in them.
		for (int i = 0; i < array.size(); i++){
			if(array.get(i).contains("e"));{
			System.out.println(i);
			}
		}
	}
}
