package week3VidsCurriculum;

public class ObjectsJavaDocsEquality {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Primitive Datatypes vs. Objects:
//
//			A primitive datatype  is just a piece of data and nothing more.  
//			int age = 19;
//			System.out.println("Age is: " + age);
//
//			An Object (e.g. String, Array, etc.) has a value, but there is much more.  An Object has properties and methods which are defined on that object, and are accessed via dot-notation. 
//			For example, we can declare a String name, which is an object, and use the method name.length()  to print out the length of the String stored in the variable name
//			String name = "Chip Brown";
//			System.out.println("The length of name is: " + name.length());
//
//			The main difference between a primitive datatype and an Object is that a primitive datatype does not have properties and methods defined on it.  
//
//			When creating your own Objects, you can define them as you need.  For example in our GradeBook example from the Array Section, we needed a Student Object,
//			so we declared a Class named Student.   Student has two fields: fullName and grades, a Constructor named Student(), and a method named describe(). 
//
//			Additionally, you will notice that Student is a Class.  In Java, a Class is the template from which an Object can be created, and an Object is an instance of
//			that class.  We use the word "instantiate" when we describe the creation of an Object from a Class by use of the Contructor of that Class.
//
//			Here is our Student Class declaration again:
//			public class Student {
//			String fullName = "";
//			int[] grades;
//
//			public Student(String fName,int[] grades) {
//			this.fullName = fName;
//			this.grades = grades;
//			}
//
//			public void describe() {
//			System.out.println("Student: " + this.fullName);
//			System.out.println("Grades:");
//			for (int grade : this.grades) {
//			System.out.println("\t" + grade + " ");
//			}
//			System.out.println();
//			}
//			}
//
//
//			In this previous example, we also use a Scanner, which is also an Object.  Notice the syntax for Scanner declaration below. And here is how we created an Object of 
//			type Student by instantiating a Student:
//			   
//			import java.util.Scanner;
//			public class GradeBook {
//			public static void main(String[] args) {
//			String fullName = "";
//			String lineVariable = "---------------------------";
//			Scanner sc = new Scanner(System.in);
//
//			System.out.println("Grade Book Example");
//			System.out.println("Name of Course:");
//			String courseName = sc.nextLine();
//			System.out.println("How many students are in this class:");
//			int numOfStudents = sc.nextInt();
//			Student[] programmingStudents = new Student[numOfStudents];
//			System.out.println("How many grades do you have per student?");
//			int numOfGrades = sc.nextInt();
//			sc.nextLine();
//
//			for (int i = 0; i < programmingStudents.length; i++) {
//			int[] grades = new int[numOfGrades];
//			System.out.print("Enter Student's Full Name: ");
//			fullName = sc.nextLine();
//			for (int j = 0; j < grades.length; j++) {
//			System.out.print("Enter a grade: ");
//			grades[j] = sc.nextInt();
//			}
//			programmingStudents[i] = new Student(fullName, grades);
//			sc.nextLine();
//			}
//
//			System.out.println("\n\n"+lineVariable+"\n " 
//			       + courseName + " Grade Book \n"+lineVariable); 
//			for (Student student : programmingStudents) { 
//			student.describe(); 
//			    } 
//			System.out.println(lineVariable+"\n");
//			sc.close();
//			}
//			} 

	}

}
