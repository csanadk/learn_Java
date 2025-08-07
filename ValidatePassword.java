package aPassword_Validator;
import java.util.Scanner;								// Imports the Scanner class to get Keyboard Inputs

class ValidatePassword {

	public static void main (String [] args) {

		String inputPassword;							// Creates the Password variable

		Scanner input = new Scanner (System.in);				// Creates a new Scanner

		System.out.print("Password: ");						// Prints the word "Password" to the screen
		inputPassword = input.next();						// Gets the user input for the password

		System.out.println(PassCheck(inputPassword));				// Calls the PassCheck Method on the password entered by the user and prints result to screen
		System.out.println("");

		main(args);								// re-runs the program (Allows for multiple tests)

	}

	public static String PassCheck (String Password) {

		String result = "Valid Password";			// Sets the initial result as valid
		int length = 0;						// Stores the number characters in the password
		int numCount = 0;					// Variable used to store numbers in the password
		int capCount = 0;					// Variable used to store capital letters in the password


		for (int x =0; x < Password.length(); x++) {
			if ((Password.charAt(x) >= 47 && Password.charAt(x) <= 58) || (Password.charAt(x) >= 64 && Password.charAt(x) <= 91) ||
				(Password.charAt(x) >= 97 && Password.charAt(x) <= 122)) {
					//Keep the Password
				} else {
					result = "Password Contains Invalid Character!";		//Checks that password contains only letters and numbers
				}

			if ((Password.charAt(x) > 47 && Password.charAt(x) < 58)) {			// Counts the number of numbers
				numCount ++;
			}

			if ((Password.charAt(x) > 64 && Password.charAt(x) < 91)) {			// Counts the number of capital letters
				capCount ++;
			}

			length = (x + 1);								// Counts the passwords length

		} // Ends the for loop

		if (numCount < 2){									// Checks that password contains two numbers
			result = "Not Enough Numbers in Password!";
		}

		if (capCount < 2) {									// Checks that password contains two capital letters
			result = "Not Enough Capital Letters in Password!";
		}

		if (length < 8){									// Checks that password is long enough
			result = "Password is Too Short!";
		}

			return (result);								// Returns the value of "result"

	} // Ends the PassCheck method
} // Ends the ValidatePassword class