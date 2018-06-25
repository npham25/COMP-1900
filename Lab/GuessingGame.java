import java.util.Scanner;

public class GuessingGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int random = (int)(Math.random() * 100 +1);
		int count = 0;
		int n = 0;
		System.out.println("I'm thinking of an integer between 1 and 100. Try to guess what it is!");
		while (n != random) {
			System.out.println("Enter your guess: ");
			n = input.nextInt();
			count ++;
			if (n > 100 || n < 0) {
				System.out.println("You must enter a number betwween 1-100. Try again.");
			}
			if (n > random) {
				System.out.println("That's too high. Try again.");
			}
			else if (n < random) {
				System.out.println("That's too low. Try again.");
			}
			else {
				System.out.println("You got it! It took you " + count + " tries to get the right number.");				
			}
		}
	}
}