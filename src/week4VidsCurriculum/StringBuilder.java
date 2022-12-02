package week4VidsCurriculum;





public class StringBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String vs. StringBuilder
//
//
//		String:
//
//		In Java, a String is immutable, which means that it can not be modified.  Strings are very useful in programming, but they should only be used if you are not modifying a
		//String once you create it!  
//
//		The immutability of String is a feature, not a bug! 
//
//		James Gosling, the chief architect of Java,  is quoted as saying that he would use an immutable whenever he could.  The immutability of Strings provides features, 
		//such as security, caching, and reusability, without having to copy the String.  There are many resources that provide a lot of insight into Strings, such as the 
		//Oracle Java Tutorials -- Strings.  
//
//
//		To further unpack the immutability of the String Object, check this out: 
//		You can assign a new value to a String variable, but both values will remain in memory.  In the following example, Java does not use the same space in memory, it leaves 
		//the value  Bob Brown and creates a new space for Sue Brown.  The syntax works, but it is not good coding practice to use the String datatype when you want to dynamically 
		//create or modify a String value within your code.

		String name = "Bob Brown";
		System.out.println(name);
		name = "Sue Brown";
		System.out.println(name);

//		Digging Deeper:   Explain what happens in the above example.   What does Java do when you assign a new value to a String? 
//
//
//		StringBuilder:
//
//		Java provides another Object that allows a programmer to build a String dynamically called StringBuilder, and it is mutable, which means that a StringBuilder can be modified.  
		//There are also great resources which discuss this Object, including the Oracle Java Tutorials -- The StringBuilder Class.
//
//		Here is an example using a StringBuilder:



		String firstName = "Bob";
		String lastName = "Brown";
		String middleInitial = "B";
		String space = " ";

		System.out.println(firstName);
		System.out.println(lastName);

		StringBuffer sb = new StringBuffer();
		//For some reason its giving an error with StringBuilder, but goes away with StringBuffer
		sb.append(firstName);
	sb.append("");
	//use append() to dynamically create a String using StringBuilder 
	sb.append(firstName);
		sb.append(space);
		sb.append(lastName);
		System.out.println(sb.toString());
//
//		// Add a middle Initial
	sb.insert(firstName.length()+1, middleInitial + space);
		System.out.println(sb.toString());
//		
		}

		



	}



