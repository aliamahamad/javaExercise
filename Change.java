/**
 * @(#)Change.java
 *
 * @StudentName: Nurul 'Alia Salwa Binti Mahamad
 * @MatricNumber: 1539009
 * @Lecturer: En. Syarbaini bin Ahmad
 * @Exercise 3
 * @version 1.00 2015/12/16
 */

import java.util.Scanner;

public class Change {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter an amount in double: ");
    	double amount = input.nextDouble();

    	int remainingAmount = (int)(amount * 100);

    	int numberOfOneDollars = remainingAmount / 100;
    	remainingAmount = remainingAmount % 100;

    	int numberOfQuarters = remainingAmount / 25;
    	remainingAmount = remainingAmount % 25;

    	int numberOfDimes = remainingAmount / 10;
    	remainingAmount = remainingAmount % 10;

    	int numberOfNickles = remainingAmount / 5;
    	remainingAmount = remainingAmount % 5;

    	int numberOfPennies = remainingAmount;

    	// Display results
    	System.out.println("Your amount " + amount + " consist of");
    	System.out.println("   " + numberOfOneDollars + " dollars");
    	System.out.println("   " + numberOfQuarters + " quarters ");
    	System.out.println("   " + numberOfDimes + " dimes");
    	System.out.println("   " + numberOfNickles + " nickles");
    	System.out.println("   " + numberOfPennies + " pennies");
    }

}