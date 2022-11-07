package Week2Vids;

public class Conditionals {
	public static void main(String[] args) {
	
/*

Now, simply printing out whether or not a Boolean expression evaluates to true or false doesn't completely help the computer in 
making a decision. To make a decision the computer needs to be told that if a Boolean expression evaluates to true, then do something, 
otherwise do something else or even nothing at all. To do this, we use conditionals. The most common conditional is an if statement. 
if statements have the following syntax:

if (/*Boolean expression {

  //code to run if Boolean expression in parentheses evaluates to true

}



if Statement -- Legally Old Enough To Drive Example:

The Boolean expression inside of the parentheses following the if statement evaluates first, and if it is true, then all the code in
between the following opening and closing curly braces will execute. If the Boolean expression evaluates to false, then the code in between 
the curly braces is skipped and does not execute. Using the previous example, we could do something like this:
	*/

int ageRequiredToDrive = 16;

int currentAge = 14;

boolean canPersonDrive = currentAge >= ageRequiredToDrive;

if (canPersonDrive) {

  System.out.println("This person can drive!");

}

/*
In this example, nothing will happen because canPersonDrive is false.  


Coding Challenge: Try increasing the currentAge to 16 or higher and run it again!


We can also place the Boolean expression directly inside the parentheses instead of creating a variable to hold the value, if we want.  
This code produces the same result as the previous version.
*/

int ageRequiredToDrive2 = 16;

int currentAge2 = 14;

if (currentAge2 >= ageRequiredToDrive2) {

  System.out.println("This person can drive!");

}


/*
if - else Statement -- Legally Old Enough To Drive Example:


What if we want to do something else if the Boolean expression evaluates to 
false rather than simply doing nothing? Then we can use an else statment. An else statement 
follows an if statement and will execute only if the preceding if statement's Boolean expression 
evaluates to false
*/

int ageRequiredToDrive3 = 16;

int currentAge3 = 14;

if (currentAge3 >= ageRequiredToDrive3) {

  System.out.println("This person can drive");

} else {

  System.out.println("This person cannot legally drive");

}
/*

If the currentAge is greater than or equal to ageRequiredToDrive, then the code in the first block will execute and "This person can drive"
will be printed. However, if the expression evaluates to false (as it will in this case since currentAge is only 14), 
"This person cannot legally drive" will be printed. 

Thus we've enabled the computer to make a decision based on comparing data.



if - else if - else Statement -- How Many Eggs Example:


Sometimes, there are more than two options in a decision. For example, what if the decision to be made was how many eggs to purchase based on how much each dozen costs? 

    If a dozen of eggs costs $3 or more, we may only want to purchase one dozen.
    If they are less than $3 but greater than $2 per dozen, we may buy 2 dozen. 
    If they are less than $2, we may buy 3 dozen.
    And finally, If they are less than a dollar, we want to buy 4 dozen. 

To do this, we can add some else if statements to our decision:

    else if statements work similarly to if statements in that they contain a set of parentheses with a Boolean expression and will only execute if that expression evaluates to true  
    However, they also function like an else statement in that they will not run if the previous if or else if Boolean expression is true. 

Once one of the Boolean expressions evaluates to true, that code block will run and the rest will be skipped. If none evaluate to true, the final else statement is the default code that will run.  For example:

if - else if - else Example:
*/
double costOfEggs = 2.12;

int numberOfDozensOfEggsToPurchase = 0;

if (costOfEggs > 3) {

  numberOfDozensOfEggsToPurchase = 1;

} else if (costOfEggs > 2) {

  numberOfDozensOfEggsToPurchase = 2;

} else if (costOfEggs > 1) {

  numberOfDozensOfEggsToPurchase = 3;

} else {

  numberOfDozensOfEggsToPurchase = 4;

}

System.out.println("I will buy " + numberOfDozensOfEggsToPurchase + " dozen eggs.");


/*

If we have a logical decision flow that has many paths, we could use a bunch of else if statements, with a single else statement 
at the very end that defines the default code to execute if all of the previous Boolean expressions in the if and else if statements 
evaluate to false  



Switch Statement -- Grade Range Example:


There is also another programming construct we can use to create logical paths with multiple options, in a similar fashion. 
This construct is called a switch statement and is used to evaluate a variable and then provide multiple different code blocks 
that could be executed based on the value of the variable. 

switch Grade Range Example:
*/

char grade = 'D';

switch (grade) {

    case 'A':

        System.out.println("90-100");

        break;

    case 'B':

        System.out.println("80-89");

        break;

    case 'C':

        System.out.println("70-79");

        break;

    case 'D':

        System.out.println("60-69");

        break;

    default:

        System.out.println("0-59");

}

	
		
		
		
	}

}
