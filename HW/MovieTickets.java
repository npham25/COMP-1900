import java.util.Scanner;

public class MovieTickets {
	public static void main(String[] args){
		 Scanner input = new Scanner(System.in);

		System.out.print("What time is your showing? (hhmm in 24-hour) ");
		double T = input.nextDouble();
		
		String hour;
		String type1 = ""; 
		String type2 = ""; 
		String type3 = "";
		int n = 1;
		int age = 0;
		int CountRegular = 0;
		int CountChild = 0;
		int CountSenior = 0;

		//Loops: Age of each member in party input. End if the age < 0
		while (age >= 0) {
			System.out.println("Please enter the age of party member " + n + ": (any negative number to exit) ");
			int A = input.nextInt();
		 	age = A;
		 	if (age >= 65){
		 		type1 = "Senior";
		 		CountSenior++;
		 	}
		 	else if (age <= 10 && age >0){
		 		type2 = "Child";
		 		CountChild++;
		 	}
		 	else if (age > 0){
		 		type3 = "Regular";
		 		CountRegular++;
		 	}
			n++;
		}
			
		//Ticket price up to hours
		double PriceS;
		double PriceC = 0;
		double PriceR;

		if (T < 1700) {
			hour = "Matinee";
			PriceS = 6.50;
			PriceR = 8.00; 			
		}
		else {
			hour = "Evening";
			PriceS = 8.00;
			PriceC = 4.00;
			PriceR = 10.50;
		}

		System.out.println("Order summary:");
		System.out.println(hour + " rates");
		double SumSenior = CountSenior * PriceS;
		System.out.printf("%-10s:\t$%10.2f\tx\t%-5d\t=\t$%10.2f\n", type1, PriceS, CountSenior, SumSenior);				
		double SumChild = CountChild * PriceC;
		System.out.printf("%-10s:\t$%10.2f\tx\t%-5d\t=\t$%10.2f\n", type2, PriceC, CountChild, SumChild);		
		double SumRegular = CountRegular * PriceR;			
		System.out.printf("%-10s:\t$%10.2f\tx\t%-5d\t=\t$%10.2f\n", type3, PriceR, CountRegular, SumRegular);		
		double Total = SumRegular + SumSenior + SumChild;
		System.out.printf("%-10s:\t\t\t\t\t\t$%10.2f\n", "TOTAL", Total);		
	}
}
