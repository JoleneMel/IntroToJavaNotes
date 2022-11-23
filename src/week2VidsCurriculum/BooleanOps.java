package week2VidsCurriculum;

public class BooleanOps {

	public static void main(String[] args) {
		/*
		Using programming to automate tasks means the computer needs a way to make decisions. Decisions require comparing and evaluating information available and then deciding which way to proceed. Boolean values are essential in these comparisons. With each decision we need the computer to make, we eventually answer in a yes or no manner - in Java, that yes or no is represented by:  true or false 


		Boolean Expression -- Legally Old Enough To Drive Example:


		Imagine that we want to know if a person is old enough to drive.  To determine that,  we need to compare the individual's age:   currentAge     to the age required to drive:   ageRequiredToDrive  

		If the person's currentAge is great than or equal to the ageRequiredToDrive  then the person can drive.
		If not, the person cannot legally drive. true and false are the only two options. 

		Here is an example of how this could be represented in Java: */

		int ageRequiredToDrive = 16;

		int currentAge = 14;

		boolean canPersonDrive = (currentAge >= ageRequiredToDrive);

		System.out.println(canPersonDrive);
/*
		Some Observations:

		    The code above will compare our two variables:   ageRequiredToDrive and currentAge 
		    We use an if statement to determine if currentAge is greater than or equal to ageRequiredToDrive
		        If the value stored currentAge is greater than or equal to agetRequiredToDrive the result of the Boolean expression (the operation using the >= operator) based on the values assigned to those variables would evaluate to true 
		        If the value stored in currentAge was less than ageRequiredToDrive, then the result would be false. 
		    The result of the Boolean expression is assigned to the variable canPersonDrive and then printed to the console. In this case, the Boolean expression evaluates to false. 
		    Note:  If currentAge were 16, 17, or another higher number, it would evaluate to true


		List of Boolean operators that exist:

		    Less than:   <
		    Greater than:   >
		    Less than or equal to:   <=
		    Greater than or equal to:   >=
		    Equal (type matters):   ==
		    */

	}

}
