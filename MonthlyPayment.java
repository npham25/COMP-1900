
import java.util.Scanner;

public class MonthlyPayment{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter  the following information:");

		System.out.print("Initial amount of loan in dollars is: ");
		double P = scanner.nextDouble();
		
		System.out.print("Annual interest rate, as a percentage is: ");
		double r = scanner.nextDouble()/1200;

		System.out.print("Number of years to pay back the loan is:  ");
		double n = scanner.nextDouble()*12;

		System.out.println();

		double M = P*r*Math.pow(1+r,n)/(Math.pow(1+r,n)-1);
		System.out.println("Monthly Payment is: $"+M);

		double T = M*n;
		System.out.println("Total paid is: $"+T);

		double I = T-P;
		System.out.println("Interest paid is: $"+I);






	}
}