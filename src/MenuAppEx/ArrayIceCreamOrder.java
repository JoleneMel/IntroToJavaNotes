package MenuAppEx;


	//public static void main(String[] args) {
//		Menu-driven Applications are very useful in the coding world.  They allow a program to receive data directly from a user.  The user is provided a menu, and then is instructed to select an option from that menu.  The chosen option will be used by the program to execute a code path (or branch) specific to that option.
//
//		In the Back End, the menus we create are text based.  Adding a Client, or Front End program, which reads in user data, and then communicates to a Back End Server could provide a graphical user interface for the Menu.
//
//		Menu-driven applications are used in a variety of industries, including but not limited to computing, application development, banking (ATMs), websites, tablets, self-guided machines, word-processors, gaming, and more
//
//
//		Menu-Driven Application:
//
//		Advantages:
//
//		    User-friendly
//
//		- Provide guidance to the user
//		- No need for a user to remember commands
//
//		    Allow a user to control how and in what order a program executes
//
//		Disadvantages:
//
//		    Difficulty finding content, especially with nested sub-menus
//
//
//
//
//		Menu-Driven Application -- ArrayIceCreamOrder Example:
//
//		MenuDriven Applications are really useful, and here is another example using Arrays.
//
//
//		ArrayIceCreamOrder.java Class:
//
//		This is the class that is used to instantiate an ArrayIceCreamOrder Object.  Notice that this class has fields, a default constructor, additional constructors, and a describe method.
//
//		package com.promineotech.application;

		public class ArrayIceCreamOrder {
		String user;
		String size;
		String cupOrCone;
		String[] flavors = new String[3];

		// Default Constructor
		public ArrayIceCreamOrder() { 
		this.user = "";
		this.size = "";
		this.cupOrCone = "";
		}
		// Additional Constructors
		public ArrayIceCreamOrder(String user, String[] flavors) {
		this.user = user;
		this.flavors = flavors;
		}
		public ArrayIceCreamOrder(String user, String[] flavors, String size, String cupOrCone) {
		this.user = user;
		this.flavors = flavors;
		this.size = size;
		this.cupOrCone = cupOrCone;
		}

		//Getters & Setters
		public String getUser() { return this.user; }
		public void setUser(String user) { this.user = user; }
		public String[] getFlavors() { return this.flavors; }
		public void setFlavors(String[] flavors) { this.flavors = flavors; }
		public String getSize() { return this.size; } 
		public void setSize(String size) { this.size = size; } 
		public String getCupOrCone() { return this.cupOrCone; } 
		public void setCupOrCone(String cupOrCone) { this.cupOrCone = cupOrCone; }

		// Describe Method
		public void describe(int iceCreamCount) {
		int printFlavors = 0;
		int boxSize = 40;
		char star = '*';

		for (int i = 0; i < boxSize; i++) {
		System.out.print(star);
		}
		System.out.println("\nIce Cream Order:\n----------------");
		System.out.print("Name:\n\t" + this.user + "\nOrder: \n\t");
		System.out.println(this.size + " " + this.cupOrCone);

		System.out.print("Flavors:\n\t");
		while (printFlavors < iceCreamCount) {
		System.out.print(this.flavors[printFlavors++]);
		if (printFlavors == iceCreamCount-1) {
		System.out.print (" & \n\t");
		} else if (printFlavors < iceCreamCount-1) {
		System.out.print (", \n\t");
		}
		}

		System.out.println();
		for (int i = 0; i < boxSize; i++) {
		System.out.print(star);
		}//end of describe 
		} // end of ArrayIceCreamOrder



	}


