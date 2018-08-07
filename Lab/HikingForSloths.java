import java.util.Scanner;

public class HikingForSloths {
	public static void main(String[] args) {
		double[] trail = new double[100];
		readData(trail);
		if(isChallenging(trail))
			System.out.println("This trail is challenging.");
		else
			System.out.println("This trail is NOT challenging.");

	}

	public static double[] readData(double[] e){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter the number of markers: ");
		int n = input.nextInt();
		
		if(n < 1) {
			System.out.println("Invalid input. The number of markers must be at least 1.");
			System.out.print("Enter the number of markers: ");
			n = input.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print("Enter elevation of marker " + (i + 1) + ": ");
			e[i] = input.nextDouble2();
		}

		return e;
	}

	public static boolean isChallenging(double[] a) {
		int peakCount = 0;
		int valleyCount = 0;

		for(int i = 1; i < a.length - 1; i++) {
			if (a[i] > a[i-1] && a[i] > a[i-1])
				peakCount++;
			else if (a[i] < a[i-1] && a[i] < a[i-1])
				valleyCount++;
		}

		if((peakCount + valleyCount) / a.length >= 0.5)
			return true;
		else
			return false;
	}

}