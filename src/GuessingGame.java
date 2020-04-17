import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    public static void main(String[] args) {


                System.out.println("I am thinking about a number between 1 and 10!");

                Random guessOne = new Random();
                int randomNum = guessOne.nextInt(10);
                int numberOftries = 0;

                System.out.println("Please Choose a number 0 - 10");
                Scanner scanner = new Scanner(System.in);
                int playerGuess = scanner.nextInt();

                while (playerGuess != randomNum && numberOftries < 3) {
                    System.out.println("That's right you are a good guesser!");

                    playerGuess = scanner.nextInt();
                    numberOftries++;

                }
                if (playerGuess == randomNum) {
                    System.out.println("It's too low. Guess again!");
                } else {
                    System.out.println("It's too high. Guess again!");
                }
            }
        }
