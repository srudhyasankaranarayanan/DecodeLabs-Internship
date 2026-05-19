package Java;

import java.util.*;

public class Numbergame {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        int RN = r.nextInt(100) + 1;
        int guess;

        System.out.println("=== Number Guessing Game ===");
        System.out.println("Guess the number between 1 to 100");

        while (true) {

            System.out.println("Enter a guessing number:");
            guess = sc.nextInt();

            if (guess > RN) {
                System.out.println("Your guess is too high");
            }

            else if (guess < RN) {
                System.out.println("Your guess is too low");
            }

            else {
                System.out.println("Correct! You guessed the number right");
                break;
            }
        }

    }
}