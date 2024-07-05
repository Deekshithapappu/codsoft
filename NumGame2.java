import java.util.Scanner;
import java.util.Random;

public class NumGame2 {
    static int score = 0;
    static int rounds = 1;

    public static void main(String[] args) {
        System.out.println("Welcome to the number game");
        System.out.println("Guess a number between 1-100");
        System.out.println("You have only 3 attempts to play");
        generateRandom();
    }

    public static void generateRandom() {
        Random randomno = new Random();
        int randomnumber = randomno.nextInt(3) + 1;  // should be between 1 and 100
        guess(randomnumber);
    }

    public static void guess(int randomnumber) {
        int attempts = 3;
        Scanner sc = new Scanner(System.in);

        while (attempts > 0) {
            System.out.println("Enter your guess:");
            int guessno = sc.nextInt();

            while (guessno < 1 || guessno > 100) {
                System.out.println("Please enter a number between 1-100");
                guessno = sc.nextInt();
            }

            if (guessno == randomnumber) {
                System.out.println("Correct! You won the game");
                score += 100;  // updating the global score variable
                System.out.println("Your score is " + score);
                System.out.println("Congratulations! You are eligible for round " + (++rounds));
                System.out.println("Guess a number between 1-100");
                System.out.println("You have only 3 attempts to play");
                generateRandom();
                return;
            } else {
                attempts--;
                if (attempts > 0) {
                    System.out.println("Sorry! Wrong guess. Guess again!");
                    System.out.println("Attempts left: " + attempts);
                } else {
                    System.out.println("Sorry! No attempts left.");
                    System.out.println("Game ends!!");
                    System.out.println("Your score is " + score);
                    System.out.println("Number of rounds you played: " + rounds);
                    System.out.println("Press 1 to continue");
                    System.out.println("Press 0 to exit");
                    int choice = sc.nextInt();
                    if (choice == 1) {
                        System.out.println("Welcome to the number game");
                        System.out.println("Guess a number between 1-100");
                        System.out.println("You have only 3 attempts to play");
                        generateRandom();
                    } else {
                        System.exit(0);
                    }
                }
            }
        }
    }
}
