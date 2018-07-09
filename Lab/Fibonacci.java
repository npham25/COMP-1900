import java.util.Scanner;

public class Fibonacci{
		public static void main(String[] args){
			Scanner input = new Scanner(System.in);

			System.out.println("Enter your value for n: ");
			long n = input.nextLong();

			while (n < 2){
				System.out.println("Invalid input. n must be at least 2");
				System.out.println("Enter your value for n: ");
				n = input.nextLong(); 
			}
			long i = 2;
			long N1 = 0;
			long N2 = 1;
			long N = 0;
			
			while (i >=2 && i <= n){
				N = N1 + N2;
				N1 = N2; 
				N2 = N;
				i++;
			}	
			double r = (double)N/N1;
			System.out.println("The Fibonacci number at position " + n + " is " + N);
			System.out.println("At that point, the ratio of that number with the previous term is " + N + "/" + N1 + " or " + r);		
		}

}	
