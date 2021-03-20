import java.util.*;

/**
 * Favourite class to test a string object and it's methods.
 * 
 * @version 20 Mar 2021
 */

public class WrappedUp {

	public void guessMyFavouriteThing() {
		// Create a string object with your favourite animal, car ..whatever
		// e.g String favMotorBikeManufacturer = "bmw"
		String myFave = "water";

		/*
		 * Now prompt for a guess - using the Scanner class Using String methods, you
		 * should give the length and first letter of your favourite thing in the
		 * prompt.
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess what my favourite thing is. 5 characters, starts with w.");
		String guess = sc.next();
		// Now test if the guess was correct - ignore case
		while (guess.equals(myFave) == false) {
			System.out.println("guess again");
			guess = sc.next();
		}
		if (guess.equals(myFave)) {
			System.out.println("Called it!");
		}

	}// end guessing

	public static void main(String args[]) {
		// Create WrappedUp object and test the methods

	}
}
