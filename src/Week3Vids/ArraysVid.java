package Week3Vids;

public class ArraysVid {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * An array in Java is a container which holds a set number of values of a single type.  The length of an array is set at the time that it is declared or instantiated, 
		 * 	and remains fixed for the life of an array.   Additionally the type contained in an array can be a primitive datatype, or an Object type.

		Some useful array information and vocabulary is contained here:

		    Square Brackets or [] tell Java that we are declaring  an array
		    element:  each item stored in an array is called an element
		    elements within the same Java array must all be the same data type.
		    index:  each element in an array is found or accessed by its numerical index.
		    arrays are zero-based, so the index values start at 0.
		    the first element in any array is located at index:  0
		    the last element of any array is located at index:   arrayName.length - 1




	Just like any variable in Java, an array must be declared.  We declare the array to give it a name, and to allocate space for the size of the array that we declare.  
		Note, that we also must determine the data type of the elements that will be stored in this array, so that Java knows how to store and manage the elements in the array.

		Let's look at a Grade Book Example.  Imagine that I have a College Programming Course that has 5 coding assignments.  For our example, I will set the values of the grades.

		Coding Challenge:  As a stretch, you could convert these examples to use the Java Scanner() as was described in the User Input Section of Week 2: Weekly Curriculum & Videos.

		One way to represent program a simple Grade Book for our five assignment Programming Course could be as follows:
		 */
		
	
		 
		String firstName = "Mary";
		String lastName = "Brown";
		int assignmentOne = 100;
		int assignmentTwo = 79;
		int assignmentThree = 80;
		int assignmentFour = 90;
		int assignmentFive = 100;

		System.out.println("Student: " + firstName + " " + lastName);
		System.out.println("Grades:");
		System.out.println("1: " + assignmentOne);
		System.out.println("2: " + assignmentTwo);
		System.out.println("3: " + assignmentThree);
		System.out.println("4: " + assignmentFour);
		System.out.println("5: " + assignmentFive);
/*
		As you can see, this works for small projects, but what if our Programming Course had 20 students each with 5 assignments, or  20 students each with 100 assignments. 
		A simple Grade Book could get out of hand very quickly.  This project can become more manageable by using arrays.  

		How do we declare an array?  Arrays can be declared a number of ways, but each declaration has the same components:  
		(1) a datatype 
		(2) Square brackets or [] 
		(3) a name. 

		Notice that the following three examples are very similar, with the third example actually setting the values within the array in the declaration.  
		All three declare an array named gradesArray, all three tell Java that we are creating an array of type int (e.g. int []), and all three tell Java
		to create enough space for 5 elements.
		*/

		    //int[] gradesArray = new int[5]; 

//		    int[] gradesArray;
//		    gradesArray = new int[5];

		   // int[] gradesArray = {100, 79, 80, 90, 100};


	//	Let's simplify the Grade Book Example now by using an array, and a for loop to print the grades:

		String fullName2 = "Mary" + " " + "Brown"; 
		int[] gradesArray2 = {100, 79, 80, 90, 100};

		System.out.println("Student: " + fullName2);
		System.out.println("Grades: ");
		for (int i = 0; i < 5; i++) {
		System.out.println((i+1) + ": " + gradesArray2[i]);
		}

		//Check out this rewrite of our Grade Book code, using an enhanced for loop to print the grades:

		String fullName3 = "Mary" + " " + "Brown"; 
		int[] gradesArray3 = {100, 79, 80, 90, 100};
		int counter = 1;

		System.out.println("Student: " + fullName3);
		System.out.println("Grades: ");
		for (int grade : gradesArray3) {
		System.out.println((counter++) + ": " + grade);
		}


	}

}
