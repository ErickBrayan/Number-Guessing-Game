import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int computerNumber = rand.nextInt(100) + 1;
        int attempts = 5;
        int chances = 0;
        int option;
        boolean validOption = true;

        try {
            game(validOption, sc, attempts, computerNumber, chances);
        }catch (InputMismatchException e) {
            System.out.println("Invalid input");
            game(validOption, sc, attempts, computerNumber, chances);
        }

        System.out.println("Do you want to play again? (y/n)");
        String play =  new Scanner(System.in).nextLine();

        if ( play.equalsIgnoreCase("y")){
            try {
                game(validOption, sc, attempts, computerNumber, chances);
            }catch (InputMismatchException e) {
                System.out.println("Invalid input");
                game(validOption, sc, attempts, computerNumber, chances);
            }
        }else {
            System.out.println("Goodbye!");
        }
    }

    private static void game(boolean validOption, Scanner sc, int attempts, int computerNumber, int chances) throws InputMismatchException {
        int option;
        boolean flag = true;

        while (validOption) {
            welcome();
            System.out.print("Enter your choice: ");
            option = new Scanner(System.in).nextInt();

            switch (option) {
                case 1:
                    attempts = 10;
                    System.out.println(messageDifficulty("easy"));
                    validOption = false;
                    break;
                case 2:
                    attempts = 5;
                    System.out.println(messageDifficulty("medium"));
                    validOption = false;
                    break;
                case 3:
                    attempts = 3;
                    System.out.println(messageDifficulty("hard"));
                    validOption = false;
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

        long startTime = System.nanoTime();

        while (attempts > 0) {
            System.out.println("Enter your guess:");
            attempts--;
            chances++;
            int userNumber = sc.nextInt();
            if (userNumber == computerNumber) {
                long endTime = System.nanoTime();
                long elapsedTime = (endTime - startTime) / 1000000000;
                System.out.println("Congratulations! You guessed the correct number in " + chances + " attempts. \n" +
                        "With time: " + elapsedTime + " seconds");
                flag = true;
                break;
            } else if (userNumber > computerNumber) {
                System.out.println("Incorrect! The number is less than " + userNumber);
                flag = false;
            } else {
                System.out.println("Incorrect! The number is greater than " + userNumber);
                flag = false;
            }
        }

        if (attempts == 0 && !flag) { System.out.println("Sorry , you lose!. The number it was " + computerNumber); }
    }

    private static void welcome() {
        System.out.println("""
                Welcome to the Number Guessing Game!
                I'm thinking of a number between 1 and 100.
                You have chances to guess the correct number.
                
                Please select the difficulty level:
                1. Easy (10 chances)
                2. Medium (5 chances)
                3. Hard (3 chances)
                """);
    }
    private static String messageDifficulty(String difficulty) {
        return "Great! You have selected the hard " + difficulty + "difficulty level.\n" +
                "Let's start the game!";
    }
}