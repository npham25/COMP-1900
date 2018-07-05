import java.util.Scanner;

public class CoastCalculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Initial amount of money: $");
		double start= input.nextDouble(); 

		System.out.print("Target amount age 65: $");
		double target = input.nextDouble(); 

		System.out.print("Contribution per year: $");
		double contribution = input.nextDouble(); 

		System.out.print("Annual growth in percent: ");
		double rate = input.nextDouble(); 

		System.out.print("Your current age: ");
		int start_age = input.nextInt(); 

		double end = 0;
		double interest = 0;
		int current_age = start_age + 1;
		int current_stop_age = current_age;
		final double original_contribution = contribution;
		final double original_start = start;

		// Determine the age stop putting contribution in
		while (current_age <=65) {
			interest = start * rate / 100;
			end = start + interest + contribution;

			start = end;
			double old_start = start;
			current_stop_age = current_age;
			
			while (current_stop_age <= 65 && end < target) {
      			interest = start * rate / 100;
				end = start + interest;
				start = end;
			
				if (current_stop_age <= 65 && end >= target){
					break;
				}
				current_stop_age ++;
			}
			
			if (current_stop_age < 65 && end >= target) {
				contribution = 0;
				break;
			}		
			
			start = old_start;
			current_age ++;
		}
		
		int stop_age = current_age;
		int print_age = start_age + 1;
		contribution = original_contribution;
		start = original_start;

		// Print the result
		if (end < target) {
			System.out.println ("Sorry! You can not reach your target when you are 65.");
		}
		else{
			System.out.println("Congratulations! You can reach that target by saving your yearly contribution amount for " + (stop_age - start_age) + " year(s) until age " + stop_age + ", the coasting the rest of the way to 65.");
			System.out.println("Projected growth: ");
			System.out.println("------------------");
			System.out.printf("%3s\t%12s\t%12s\t%12s\t%12s\n", "Age", "Start", "Interest", "Contributions", "End");

			while (print_age <= 65) {
				interest = start * rate / 100;
				end = start + interest + contribution;
				System.out.printf("%3d\t%12.2f\t%12.2f\t%12.2f\t%12.2f\n", print_age, start, interest, contribution, end);
				if (print_age == stop_age) {
					contribution = 0;
				}
				start = end;
				print_age ++;
			}
		}
	}
}