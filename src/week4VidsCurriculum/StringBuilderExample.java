package week4VidsCurriculum;

public class StringBuilderExample {
public static void main(String[] args) {

String firstName = "Bob";
String lastName = "Brown";
String middleInitial = "B";
String space = " ";

System.out.println(firstName);
System.out.println(lastName);

StringBuffer sb = new StringBuffer();

//StringBuilder output = new StringBuilder();
//
//output.append(firstName);
// use append() to dynamically create a String using StringBuilder 
//append() is not working... investigate tomorrow
sb.append(firstName);
sb.append(space);
sb.append(lastName);
System.out.println(sb.toString());

// Add a middle Initial
sb.insert(firstName.length()+1, middleInitial + space);
System.out.println(sb.toString());

}
} 
