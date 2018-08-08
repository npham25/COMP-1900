import java.util.Scanner;

public class HikingForSloths {
	public static void main(String[] args) {
		if(isChallenging(readData()))
			System.out.println("This trail is challenging.");
		else
			System.out.println("This trail is NOT challenging.");

	}

	public static double[] readData(){
		Scanner input = new Scanner(System.in);
		int n = 0;
		while ( n < 1) {
			System.out.print("Enter the number of markers: ");
			n = input.nextInt();
			if (n < 1)
				System.out.println("Invalid input. The number of markers must be at least 1.");
		}

		double[] e = new double[n];
		for (int i = 0; i < e.length; i++) {
			System.out.print("Enter elevation of marker " + (i + 1) + ": ");
			e[i] = input.nextDouble();
		}

		return e;
	}

	public static boolean isChallenging(double[] a) {
		int peakCount = 0;
		int valleyCount = 0;

		for(int i = 1; i < a.length - 1; i++) {
			if (a[i] > a[i-1] && a[i] > a[i+1])
				peakCount++;
			if (a[i] < a[i-1] && a[i] < a[i+1])
				valleyCount++;
		}

			return (double)(peakCount + valleyCount) / a.length >= 0.5; // true or false, 0.5 is double -> change data to double
	}

}
