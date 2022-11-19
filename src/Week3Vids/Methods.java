package Week3Vids;

public class Methods {

	public static void main(String[] args) {
		//Let's call these two functions:

		
		

				//************Variable Declarations — visible in Main ONLY!************************

				int firstNumber = 3;

				int secondNumber = 7;

				//Call to first Method — passing variables into this Method as Parameters!

				sumTwoNumsPrintResult(firstNumber,secondNumber);

				//Additional Variable Declarations — visible in Main ONLY!

				int result = 0;

				//Call to second Method

				result = sumTwoNumsReturnResult(firstNumber,secondNumber);

				System.out.println("The sum is: " + result);

				 // End of main()
	}
//		Java uses methods to accomplish predefined tasks.  A method is code that runs when it is called.  When you write a program, 
//		and realize that you are writing the same code over and over, it's time to put that code into a method.  Another definition of 
//		a Java Method is that it is a collection of statements that are written together, and executed together to perform a task. 
//
//		What is a method declaration?
//		modifier returnDatatype methodName (datatype1 par1, datatype2 par2) {
//		BodyOfMethod
//		}
		
/*
 * 	Here, these parts of the method declaration are explained below:
	

		            modifier − modifier -- public, protected, default and private
		            returnDatatype − the return datatype (Can be a Java primitive datatype,  an Object, or a Collection of a datatype or an Object, or can be void).
		            methodName − name of the method
		            datatype1, datatype2 - datatypes of the parameters 
		            par1, par2 − formal parameters
		            datatype1 par1, datatype2 par2 − list of parameters (Can be as many as you need, separated by commas)
		            BodyofMethod —> this is where you put your code… anything that you want to accomplish in that particular method.  All Java code,
		            and will include variable declarations, method calls, etc.

		Let's define a method here:
*/
		public static void sumTwoNumsPrintResult (int number1, int number2) {

		int sum = 0;

		sum = number1 + number2;

		System.out.println("The sum is: " + sum);

		// No return statement, because the returnType is void!

		}

		//What if we want to return the result?

		public static int sumTwoNumsReturnResult (int number1, int number2) {

		int sum = 0;

		sum = number1 + number2;

		return sum;

		}

		
		}
