package guessingGame;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

	public static void main(String[] args) {
		int guessCounter = 0;
		int upper = 10;

		Random r = new Random();
		int x = 1+ r.nextInt(upper); //find a rando number between 1 and 10


		//System.out.println("The upper bound of this game is " + upper);
		boolean found = false;
		boolean continueSearching = true;
		do{
			Scanner scan = new Scanner(System.in);
			System.out.println("Guess a number (int): ");
			int guess = scan.nextInt();
			guessCounter++; //adds one every time you guess
			if (guess == x){
				System.out.println("YOU GOT IT! The number was " + x +" | It only took you " + guessCounter + " guesses!");  //include a bit about how many tries it took
				found = true;
			}
			else if (guess > x){
				
				Boolean tempLeaveDo = false;
				do{
					System.out.println("You guessed too high, try again? (Y/N)");
					String keepSearching = scan.next();
					if (keepSearching.equalsIgnoreCase("n")){
						continueSearching = false;
						tempLeaveDo = true;
						
					}
					else if(keepSearching.equalsIgnoreCase("y")){
						tempLeaveDo = true;
					}
					else{
						System.out.println("Sooo, do you want to keep searching? (Y/N)");
					}

				}while (tempLeaveDo == false);

			}


			else if (guess < x){
				Boolean tempLeaveDo = false;
				do{
					System.out.println("You guessed too low, try again? (Y/N)");
					String keepSearching = scan.next();
					if (keepSearching.equalsIgnoreCase("n")){
						continueSearching = false;
						tempLeaveDo = true;
						
					}
					else if(keepSearching.equalsIgnoreCase("y")){
						tempLeaveDo = true;
					}
					else{
						System.out.println("Sooo, do you want to keep searching? (Y/N)");
					}

				}while (tempLeaveDo == false);
			}


		}while (found == false && continueSearching == true);
	}

}


//maybe add a hint ability after a certain amount of wrong answers
