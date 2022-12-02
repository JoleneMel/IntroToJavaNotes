package week5VidsCurriculum;

public class Exceptions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		What is an Exception?
				


				Exception:  An exception is defined as an event that occurs that is contrary to the expected behavior of the application or program that has been written.  
				Instead of functioning as expected, something happens that causes an unexpected result.


				In Java, there are two types of Exceptions: 

				- Checked Exceptions -- these are checked by the compiler at compiler time.

				Example:   syntax errors -- a missing semi-colon or closing curly brace, incorrect datatype assignment, returning the wrong data type from a method, etc.

				- Unchecked Exceptions -- these are not caught by the compiler, included here are runtime exceptions and errors.

				Runtime Exception Example: Trying to access a Null Address, Out-of-Bounds Indices,
				Class:  RuntimeException, NullPointerException, ArithmeticException, etc.

				Error Exception Example:  Serious issues that cause an application to abort, or to stop running, including Memory or Stack Overflow Errors, 
				Class:  OutOfMemory, StackOverflow, VirtualMachineError, etc.



				What is Exception Handling?


				Exception Handling:  In programming, how the code deals with or handles Unchecked Exceptions is called Exception Handling.  What does an application do with an 
				unexpected occurrence?  An application needs to make sure it has a plan for when things go wrong.



				Comparing Diagnosing Car Troubles to Exceptions:

				To get a better idea of what an Exception is and why Exception Handling is important, let's take a look at something a bit more familiar, a car.     

				Imagine as you are driving or riding along, the car engine stops working.  What is wrong?  Why did your car stop?   How do we get our car engine running again?  
				The solution totally depends on what the problem with the car is:
				- Would filling the car with gas fix a dead battery? 
				- Would changing a tire fix an overheated engine?
				- Would adding oil fix being out of gas?

				It's important to know what a problem is before we randomly start fixing things in the hope that we fix the right issue.  

				- If there is no electricity in your car, filling your gas tank will not help
				- If your check engine light is on,  changing a tire will not solve it
				- If your gas gauge is on Empty, adding oil will not help that issue.

				Cars are designed with features to help you diagnose issues.  There are gauges, warnings, and codes that indicate when something needs to be addressed in your car.


				The Moral of the Story:

				As a car owner, it is good practice to notice when something is not as you expect (e.g. a warning light comes on, the gas gauge is on Empty, the car is slow to start, etc.)

				As a software developer,  it is good practice to use Exception Handling in your programming to gracefully handled unexpected event.    We can not predict every failure 
				in our programs, but we can definitely catch exceptions, and communicate back to the user clues as to what the issue is.

				- Invalid Input:  What does the application do when a user puts in an invalid username and/or password?    Instead of crashing, or quitting, the program can validate 
				the input, and reprompt a user for their username and/or password.

				- Network Failure: When you are accessing a server over a network, and the internet is down, what does the application do?  crash?  or give an error that says network 
				unavailable, try again later.



				The video in this chapter covers the way to handle exceptions in  Java, which include

				- Diagnose and fix checked exceptions before running your code.
				- Use try/catch blocks & the throws keyword to handle unchecked exceptions


*/
	}

}
