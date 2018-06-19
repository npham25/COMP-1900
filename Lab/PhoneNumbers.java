
import java.util.Scanner;

public class PhoneNumbers{
	public static void main(String [] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter a 10-digit phone number (no spaces or dashes): ");
		long P = scanner.nextLong();
		
		System.out.println();

		long A = P/10000000;
		System.out.println("Area code: "+A);

		long F = P%10000000/10000;
		System.out.println("First three digits: "+F);
		
		long L = P%10000000%10000;
		System.out.println("First three digits: "+L);	
	







	}
}
