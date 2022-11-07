package Week2Vids;
import java.util.*; 
public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * We need data to tell our programs to make decisions with; and up to this point, we've been hard coding data into variables to 
		 * explore coding constructs. However, the original source for most data is user input. In order to make decisions based on 
		 * responses or data entered from a user, let's take a look at one way we can prompt a user to enter some data and then store the 
		 * data in a variable to use in our code. 
		 */

		/*Note:  this method of interacting with a user is a temporary method for the purpose of being able to receive user input and is not the recommended way in live, production code to interact with users.  We will learn additional ways later on.

		To receive user input in Java, we can use the Scanner object.  It is in java.util, so we need to import it.
		For example:
*/
		/* 
		 * 
		 * 
		 * This is th first one 
		Scanner sc= new Scanner(System.in);    
		System.out.print("Enter username:  ");   
		String username = sc.nextLine();   
		System.out.print("Enter password: "); 
		String password = sc.nextLine();               
		if (username.equals("samy123") && password.equals("12345")) {
		 System.out.println("Welcome back " + username);
		    } else { 
		 System.out.println("Inaccurate credentials!"); 
		} // end of else 
		 }
*/

//		The above code will prompt a user for a username and a password and if the username and password match "samy123"  
//and "12345" relatively, the user will be welcomed. If not, the user will see a message saying their credentials are not correct. 
//
//		With the above example, we have to run the program each time to run it again. So, if a user puts in the incorrect 
//credentials, they see the message and nothing happens until they run the application again.
//
//		To have a better user experience, we would most likely want to prompt the user for their credentials again 
//after a failed login attempt. We can do this with a loop. 
//
//
//		Let's try the following: 
		//This is the improved version

		boolean loggedIn = false;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);   
		while (!loggedIn) {
		System.out.print("Enter username: ");   
		String username = sc.nextLine();   
		System.out.print("Enter password: ");  
		String password = sc.nextLine();   
		if (username.equals("samy123") && password.equals("12345")) {
		System.out.println("Welcome back " + username);
		loggedIn = true;
		    } else { 
		System.out.println("Inaccurate credentials!"); 
		} // end of else 
		} // end of while


		/*In the above code, we use a Boolean variable as a flag to determine whether the user is logged in or not. If the user enters the wrong 
		credentials, nothing happens to the loggedIn variable, so it remains false causing the loop to iterate again and again until the user 
		enters the correct credentials, at which point we update the loggedIn variable to true, which will cause the loop to stop iterating. 

		Coding Challenge:  
		We could also add a login attempt count that would enable the user to only enter the incorrect credentials a certain number of times before displaying a message like "You are locked out!" and ending the loop. 
*/
	}

}
