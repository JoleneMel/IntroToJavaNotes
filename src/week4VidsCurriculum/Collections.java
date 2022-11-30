package week4VidsCurriculum;

import java.util.HashSet;
import java.util.Set;

public class Collections {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		What is a Collection?  Think of a Collection as an Object, but that Object can contain (or represent) a group of Objects.  Java provides a Collection Framework, 
//				which is an architecture that allows a unified access to a variety of different collections.  You have already been introduced to Lists, and it was 
//				mentioned that a List an Interface that falls within the Collections Framework.  Two additional types of Collection Interfaces are Sets and Maps.  
//
//				Collection Interfaces:  Set, List, Map, and others
//
//				Collection Implementations:  There are a number of classes provided in Java that are used to implement the Collection Interfaces.   See the Java 
//				Collections Framework Overview link below for additional information on Collection Implementations.
//
//				Interface --> Implementation
//
//				    Set --> HashSet, TreeSet, LinkedHashSet
//				    List --> ArrayList, LinkedList
//				    Map --> HashMap, TreeMap, LinkedHashMap
//
//
//				The Collections Class:  
//
//				The Collections Class contains static methods that either return collections, or perform some operation on collections.  A NullPointerException is 
//						thrown by all methods of this class if the collections or Class Objects provided are null.  Check out the links below for information on 
//						the Java Class Collections.
//
//						
//				Set:
//
//				    No Duplicates
//				    At most one Null element
//				    Not guaranteed to be in any particular order
//
//
//				Set Example:
//
//				Notice the order of the Strings that are inserted into this Set. 

				Set<String> vegetables = new HashSet<String>();

				vegetables.add("Carrot");
				System.out.println(vegetables);
				vegetables.add("Onion");
				System.out.println(vegetables);
				vegetables.add("Broccoli");
				System.out.println(vegetables);
				vegetables.add("Asparagus");
				System.out.println(vegetables);


//
//				What happens if you add a duplicate to a Set?
//				Questions to ask: 
//				1. Is an error thrown? 
//				2. Does the duplicate get stored?
				   
				vegetables.add("Carrot");
				System.out.println(vegetables);

				vegetables.add(null);
				System.out.println(vegetables);

				vegetables.add(null);
				System.out.println(vegetables);

				System.out.println("The size of our set is: " + vegetables.size());

	}

}
