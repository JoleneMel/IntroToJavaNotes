package Week2Vids;

public class ExtraContentLimitsOfSwitches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//This can be accomplished with a switch statement like below 
		//A switch statement isn't the best job for this for multiple reasons
		String letterGrade;
		//It only accepts int and Strings, not chars or doubles
		int numericGrade = 80;

		// a switch statement works on strings in Java 7 and above
		switch(numericGrade) {
		//They do not have ranges
		case 100: case 99: case 98: case 97: case 96: case 95: case 94: case 93: case 92: case 91: case 90:
		letterGrade = "A";
		break;
		case 89: case 88: case 87: case 86: case 85: case 84: case 83: case 82: case 81: case 80:
		letterGrade = "B";
		break;
		case 79: case 78: case 77: case 76: case 75: case 74: case 73: case 72: case 71: case 70:
		letterGrade = "C";
		break;
		case 69: case 68: case 67: case 66: case 65: case 64: case 63: case 62: case 61: case 60:
		letterGrade = "D";
		break;
		default:
		letterGrade = "F"; // not really needed, but makes the program clearer
		break;

		}
		System.out.println("Your letterGrade is " + letterGrade);
		


	String letterGrade2;
		//It only accepts int and Strings, not chars or doubles
		int numericGrade2 = 80;

		// a switch statement works on strings in Java 7 and above
		switch(numericGrade2) {
		//They do not have ranges, so to do it you need to make ranges like this
		case 100: case 99: case 98: case 97:
		letterGrade2 = "A+";
		break;
		case 96: case 95: case 94: case 93:
		letterGrade2 = "A";
		break;
		case 92: case 91: case 90:
		letterGrade2 = "A-";
		break;
		case 89: case 88: case 87:
		letterGrade2 = "B+";
		break;
		 case 86: case 85: case 84: case 83:
		letterGrade2 = "B";
		break;
		case 82: case 81: case 80:
		letterGrade2 = "B-";
		break;
		case 79: case 78: case 77:
		letterGrade2 = "C+";
		break;
		case 76: case 75: case 74: case 73:
		letterGrade2 = "C";
		break;
		case 72: case 71: case 70:
		letterGrade2 = "C-";
		break;
		case 69: case 68: case 67:
		letterGrade2 = "D+";
		break;
		case 66: case 65: case 64: case 63:
		letterGrade2 = "D";
		break;
		case 62: case 61: case 60:
		letterGrade2 = "D-";
		break;
		default:
		letterGrade2 = "F"; // not really needed, but makes the program clearer
		break;

		}
		System.out.println("Your letterGrade is " + letterGrade2);
		

//		But more commonly due to the limitations of a switch statement this problem is solved usually by an if/else if 
//		char letterGrade;

				double numericGrade3 = 75; //pretend this could be anything, you can play with within eclipse and see how the value changes 
				char letterGrade3;


				if (numericGrade3 >= 90.00) {
					letterGrade3 = 'A';
					//As shown above and below letter grade can be redefined as needed depending on the numericGrade's value
					System.out.println(letterGrade3);

				}else if (numericGrade3 >= 80.00) {
					letterGrade3 = 'B';
					  System.out.println(letterGrade3);

				}else if (numericGrade3 >= 70.00) {
					letterGrade3 = 'C';

					    System.out.println(letterGrade3);

				}else if (numericGrade3 >= 60.00) {
					letterGrade3 = 'D';

					    System.out.println(letterGrade3);

				} else  {
					letterGrade3 = 'F';
					    System.out.println(letterGrade3);


					    }



	}

}
