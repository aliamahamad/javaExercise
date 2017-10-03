/**
 * @(#)Parking_fees.java
 * Student Name: NURUL 'ALIA SALWA BINTI MAHAMAD
 * Lecturer Name: MR. SYARBAINI BIN AHMAD
 * Matric No: 1539009
 * @version 1.00 2016/2/16
 */
import java.util.Scanner;

public class Parking_fees
{
    public static void main(String [] args)
    {
    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter the number of cars parked yesterday: ");
        final int NUMBER_OF_CARS = input.nextInt();

        double hoursParked=0;
        double currentCost=0;
        double totalCost=0;

        for(int count = 1; count <= NUMBER_OF_CARS; count++)
        {
            System.out.print("Enter hours parked for car " + count + ": ");
            hoursParked = input.nextDouble();
            currentCost = calculateCharges(hoursParked); //most recent customer
            totalCost += currentCost; //Running total
        }

        System.out.println("Most recent customer paid: "   +  currentCost);
        System.out.println("Running total of yesterday's receipts: " + totalCost);
    }

    public static double calculateCharges (double totalHours)
    {

        double garageCost = 0;

        if(totalHours <= 3)
            garageCost = 2;

        else if(totalHours > 3 && totalHours <= 19)
            garageCost = 2.0 + 0.5 * (totalHours - 3);

        else if (totalHours > 19)
            garageCost = 10;

        return garageCost;
    }
}