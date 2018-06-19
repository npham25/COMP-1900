import java.util.Scanner;

public class Paint{
	public static void main(String [] args) {
			Scanner input = new Scanner(System.in);

			System.out.println("Length of the room (ft): ");
			double LR = input.nextDouble();
			
			System.out.println("Width of the room (ft): ");
			double WR = input.nextDouble();			

			System.out.println("Height of the room (ft): ");
			double HR = input.nextDouble();

			System.out.println("Width of the room's door (ft): ");
			double WD = input.nextDouble();

			System.out.println("Height of the room's door (ft): ");
			double HD = input.nextDouble();

			System.out.println("Width of the room's window (ft): ");
			double WW = input.nextDouble();

			System.out.println("Height of the room's window (ft): ");
			double HW = input.nextDouble();

			System.out.println("The type of paint to use (Standard or Deluxe): ");
			String T = input.next();

			double A = 2*HR*(WR+LR) - HD*WD - HW*WW;
			System.out.println("The paint wall area of the room: " + A);
			
			double C1 = A/250;
			int C2 = (int)A/250;
			int C;
			if (C1 != C2) {
				C = C2 + 1;
			}
			else {
				C = C2;
			}
			System.out.println("The number of cans of paint required: " + C);

			double CBT;
			if (T == "Standard") {
			;	CBT = C * 14.99;
			}
			else {
				CBT = C * 29.99;
			}	
			double TAX = CBT * 0.0925;
			double CAT = CBT + TAX;
			System.out.println("The before-tax cost of paint: $" + CBT);
			System.out.println("The dollar amount of tax: $" + TAX);
			System.out.println("The after-tax cost of paint: $" + CAT);



				




			}
	}
