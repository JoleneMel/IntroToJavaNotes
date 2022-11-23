package Week3Vids;

public class Equality {

	public static void main(String[] args) {
		// TODO Auto-generated method stubAnother difference between Primitive Datatypes and Objects has to do with Equality.   The Equality Operator in Java == checks to see if two references are the same.  In other words when comparing Primitive Datatypes,  == checks to see if two values are the same.  With Primitive Datatype Equality Comparison,  == checks the in-memory value of the Primitive Datatype against the in-memory value of a different Primitive Datatype.   

//Primitive Datatype Equality
//
//The following code declares two int variables, and compares the value.  Since these two variables are pointing to the same value, 
//the System.out.println() will print the following result:  age1 == age2: true
int age1 = 21;
int age2 = 21;
System.out.println("age1 == age2: " + (age1 == age2));


//Object Equality
//
//Remember that when an Object is instantiated, the programmer has access to all properties and methods that are defined within that Object, through dot-notation.
//
//With the declaration of a new Object, Java creates that object as its own instance in memory.  Even if two Objects are created with the same exact content, the
//Objects themselves will be created as two separate instances in memory.  The point here is that each instance has its own location in memory, and the location 
//is not the same, even if the values within the fields are the same.
//
//Let's look at our Grade Book Example above.   Imagine that we instantiate two students using the Student() Constructor as follows:

int[] grades = { 100, 100, 100 };
Student student1 = new Student("Molly Mack", grades);
Student student2 = new Student("Molly Mack", grades);

//Notice that the data is exactly the same, but we are creating two distinct Objects by using the new keyword.  So, if we run the following comparisons, 
//the results will be reflect that the student1 Object is not the same as the student2 Object, because their locations in memory are distinct.   
//These are Objects, not Primitive Datatypes.  The only one of the following examples that will be true is when we compare the student1.fullName to 
//"Molly Mack" with the .equals() method.

System.out.println("student1 vs. student2 Equality Example:");
System.out.println("---------------------------------------");
System.out.println("Is student1 == student2? " 
                    + (student1 == student2));
System.out.println("Is student1.equals(student2)? " 
                    + (student1.equals(student2)));
System.out.println("Is student1.equals(\"Molly Mack\")? " 
                    + (student1.equals("Molly Mack")));
System.out.println("Is student1.fullName.equals(\"Molly Mack\")? " 
                    + (student1.fullName.equals("Molly Mack")));

//Object Equality is fun to explore, and when you assign two variables to the same Object, it's fun to see what the result is.  Let's declare a new variable student3 and 
//initialize it with the  student2 Object as follows:
//
Student student3 = student2;
//
//The results of the following comparisons will be quite different than the student1 vs. student2 comparisons above. In fact, the results will be true for each comparison:

System.out.println("student2 vs. student3 Equality Example:");
System.out.println("---------------------------------------");
System.out.println("Is student2 == student3? " 
                    + (student2 == student3));
System.out.println("Is student2.equals(student3)? " 
                    + (student2.equals(student3)));

//Put your knowledge to the test:   Why is the result different?  Spend some time doing research into Object Equality in Java!

	}

}
