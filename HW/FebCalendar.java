import java.util.Scanner;

public class FebCalendar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the day that Jan.1 fell on: (0 = Sun., 1 = Mon., etc. ");
        int n = input.nextInt();
        
        while (n < 0 || n > 6){
            System.out.println("This is not a valid input. Enter 0-6.");
            System.out.println("Enter the day that Jan.1 fell on: (0 = Sun., 1 = Mon., etc. ");
            n = input.nextInt();
        }

        final int NUM_OF_DAY_PER_LINE = 7; // print 7 days per line
        int day = 1; //count days
        int First_Feb = (n + 3)%7; 
        int blank = 0;

        System.out.println ("Feburary");
        System.out.println ("--------");
        System.out.printf("%3s\t%3s\t%3s\t%3s\t%3s\t%3s\t%3s\n", "S", "M", "T", "W", "T", "F", "S"); //print tilte of the day
                
        while (blank < First_Feb) { 
            System.out.printf("\t");
            blank ++;
        }
        int line = day +blank;
        while (day <= 28){ //28 days in Feburary
            System.out.printf("%3d\t",day);
            day ++;
            if (line%NUM_OF_DAY_PER_LINE == 0){ 
            System.out.printf("\n");
            }
            line ++;
        }       
        
        System.out.println();
    
    }
}