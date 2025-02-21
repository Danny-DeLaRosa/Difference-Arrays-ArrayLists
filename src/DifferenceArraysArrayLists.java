import java.util.ArrayList; //imports array list methods
import java.util.List; // imports list methods

public class DifferenceArraysArrayLists {

	public static void main(String[] args) {
		int n = 4;
		// Arrays
		
		// Array that holds 5 integers
//		int[] a = new int[5];
		
		int[] a = {2, 7, 9, 43, 78}; 
		// assigns a number at index 3
		a[3] = 27;
		
		//Arrays are not flexible so i cannot add or subtract a number from the array. 
//		a[5] = 75; // results in out of bounds error
		System.out.println(n); //prints variable 
		System.out.println(a);// prints the location or reference of array
		System.out.println(a[3]);// prints the location or reference of array
		
		//ArrayLists
		
		// ArrayList that holds 5 integers
		ArrayList<Integer> al = new ArrayList<>(List.of(2, 7, 9, 43, 78));
		System.out.println(al); //prints the entire ArrayList
		
		//ArrayLists are more flexible in that you can modify the array with methods
		al.add(69); // adds integer to ArrayList
		al.add(0, 32); // you can specify where the integer can go. like at the beginning
		
		System.out.println(al); //prints the entire ArrayList
		System.out.println(al.get(3)); // prints specific value based on index
		al.set(1, 12); //changes value at a given index
		System.out.println(al); //prints the entire ArrayList (now changed)
		al.remove(5); // removes a value at a given index
		System.out.println(al); //prints the entire ArrayList (now changed)
		
		
		
		
		print_array(a); //prints the entire ArrayList (now changed)
		print_array_list(al); //prints the entire ArrayList (now changed)		
		
	}
	// method that prints each value in an array
	public static void print_array(int[] a) {
		for(int e:a)
			System.out.print(e + " ");
		System.out.println();
	}
	// method that prints each value in an ArrayList
	public static void print_array_list(ArrayList<Integer> a) {
		for(int e:a)
			System.out.print(e + " ");
		System.out.println();
	}

}
