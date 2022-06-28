
import java.util.InputMismatchException;
import java.util.Scanner;

public class Guessing_the_Number {
    static Scanner keyboard = new Scanner(System.in);
    private static final int MAX_NUMBER = 20;

    public static void main(String[] args) {
        boolean checking = true, valid = true, verifyName = true;
        String response, name = null;

        while (verifyName) {
            System.out.println("What is your name?");
            name = keyboard.nextLine();
            verifyName = verifyName(name);
        }

        System.out.printf("\nWell, %s, I am thinking of a number between 1 and 20.\nTake a guess.", name);


        do {
            playGame();  // call subroutine to play one game
            while (valid) {
                System.out.print("Would you like to play again? (y or n): ");
                response = keyboard.next().toLowerCase();
                if (response.equals("n")) {
                    valid = false;
                    checking = false;
                } else if (response.equals("y")) {
                    System.out.println("Starting a new game");
                    break;
                } else {
                    System.out.println("Please enter \"y\" or \"n\"");
                }
            }
        } while (checking);
        System.out.println("Thanks for playing!");
    }

    public static boolean verifyName(String name) {
        if (name.matches("[A-Z][a-zA-Z]*")) {
            return false;
        } else {
            System.out.println("Please enter a valid name");
            return true;
        }
    }

    static void playGame() {
        boolean verifyNum = true;
        int computersNumber; // A random number picked by the computer.
        int usersGuess = 0;      // A number entered by user as a guess.
        int guessCount;      // Number of guesses the user has made.
        computersNumber = (int) (20 * Math.random()) + 1;
        // The value assigned to computersNumber is a randomly
        //    chosen integer between 1 and 20, inclusive.
        guessCount = 0;
        System.out.println();
        System.out.print("What is your first guess? ");
        while (true) {
            while (verifyNum) {
                try {
                    usersGuess = keyboard.nextInt();  // Get the user's guess.
                    verifyNum = verifyNumber(usersGuess);
                    guessCount++;
                } catch (InputMismatchException e) {
                    // If the user enters a non-number.
                    System.out.print("Invalid entry! Enter your selection (1-" + MAX_NUMBER + "): ");
                    keyboard.nextLine();
                }
            }

            if (usersGuess == computersNumber) {
                System.out.println("\nYou got it in " + guessCount
                        + " guesses!  My number was " + computersNumber);
                break;  // The game is over; the user has won.
            }
            if (guessCount == 6) {
                System.out.println("\nYou didn't get the number in 6 guesses.");
                System.out.println("You lose.  My number was " + computersNumber);
                break;  // The game is over; the user has lost.
            }
            // If we get to this point, the game continues.
            // Tell the user if the guess was too high or too low.
            if (usersGuess < computersNumber) {
                System.out.print("That's too low.  Try again: ");
            }
            else {
                System.out.print("That's too high.  Try again: ");
            }
            verifyNum = true;
        }
        System.out.println();
    } // end of playGame()

    public static boolean verifyNumber(int num) {
        // If the number was outside the min/max, error out.
        // Otherwise, return the valid number.
        if (num > MAX_NUMBER || num <= 0) {
            System.out.print("Invalid entry! Enter your selection (1-" + MAX_NUMBER + "): ");
            return true;
        } else {
            return false;
        }
    }
}



