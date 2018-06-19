import java.util.Scanner;

public class TuitionCalculator{
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("How many total hours are you taking? ");
		int H = input.nextInt(); //toal hours

		System.out.print("How many of those hours are from engineering/science classes? ");
		int ES = input.nextInt(); //Eng/Sci hours

		int T = 0; // Cost up to 12 hours
		int B =0 ; // Cost beyond 12 hours
		int TES =0; //Cost of Eng. Sci. classes
		int TOTAL; //Total tuition

		if ( H >= ES){
			System.out.println("Summary of Charges:");
			System.out.println("------------------");

			if (H <= 12){
				T = 400 * H;
				System.out.println("($400 per credit hour up to 12) * (" + H + " credit hours) = $" + T);
			}

			else {
				T = 400 * 12;
				B = 60*(H-12);
				System.out.println("($400 per credit hour up to 12) * (12 credit hours) = $" + T);
				System.out.println("($60 per credit hour beyond 12) * (" + (H-12) + " credit hour(s)) = $" + B);
			}
			
			if (ES > 0) {
				TES = ES * 25;
				System.out.println("($25 per eng./sci. credit hour) * (" + ES + " credit hour(s)) = $" + TES);
			}

			TOTAL = T + B + TES;
			System.out.println("TOTAL = $" + TOTAL);
		}
		else {
			System.out.println("Your input is NOT correct. Try again");
		}
	
	}
}