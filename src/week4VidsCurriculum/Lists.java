package week4VidsCurriculum;


import java.util.ArrayList;
import java.util.List;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Programming is all about data, and being able to organize data is essential when writing applications. We need organized, quick access to our data.  
//		Java provides a many ways to organize data, two of which are Arrays and Lists.   Both allow a elements to be directly accessed. 
//
//
//		Array:
//
//		Arrays allow storage of elements together.  Arrays are Objects in Java.  You must choose the size of an Array when it is declared, and once declared, the 
//		size of an array is immutable or unchangeable.  If you know the number of items that you are storing,  Arrays are very effective and useful data structures.  
//		Items in an array are stored in a continuous manner in memory, and arrays provide for very quick access to the elements.
//
//		Example declaring an Array of Strings:

		String[] myInstruments = new String[4];
		myInstruments[0] = "Tuba";
		myInstruments[1] = "Trombone";
		myInstruments[2] = "Trumpet";
		myInstruments[3] = "Triangle";

//		Another way to create this same array would be as follows:

		String[] myInstruments2 = {"Tuba", "Trombone", "Trumpet", "Triangle"};

//		Note:   that if we try to add an element to index 4 in myInstruments, an  ArrayIndexOutOfBoundsException will be thrown.
//
//		An Array:
//		- is required to be constructed.
//		- has a fixed size.
//		- holds variables of the same type
//		- has elements that are accessed via an index.
//
//
//		Lists:
//
//		Lists are used to "collect"  elements.   By creating a List, you can store any number of elements,  dynamically modifying the List, and the location of each item is 
//		managed by the List.  Each element is accessible through a variable that you declare as a List.
//
//		A List in Java is an Interface.   To use a List in Java, you will import the java.util library, and a List will need to be declared and initialized.  A List is often 
//		implemented by the ArrayList class, but can also be implemented by one of these classes:  LinkedList, Vector and Stack.  If you choose ArrayList,  you will also have
//		to import ArrayList from java.util.

//		Example declaring a List of String:

		List<String> myInstruments3 = new ArrayList<String>();
		myInstruments3.add("Tuba");
		myInstruments3.add("Trombone");
		myInstruments3.add("Trumpet");
		myInstruments3.add("Triangle");

//		Notice that unlike an Array, you can dynamically add additional elements to your List, inserting as many elements as you wish to this same List, without throwing an exception:

		myInstruments3.add("Flute");
		myInstruments3.add("Clarinet");
		myInstruments3.add("Oboe");

		System.out.println(myInstruments3);
//		A List:
//		- Is Ordered
//		- Preserves Insertion Order
//		- Allows Positional Access and Insertion of Items
//		- Allows Duplicates
//		- Is a Collection of Objects 
//
//
//		Arrays vs. ArrayLists:
//
//		To review, the array is a specified-length data structure, and in contrast, the ArrayList is a variable-length Collection class.

	}

}
