// To prompt the user to enter a number in pounds

import java.util.Scanner;

public class ConvertPoundsIntoKilograms {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);

    	double pound = 0.454;

    	System.out.print("Enter a number in pounds: ");
    	double pounds = input.nextDouble();

    	double totalKilograms = pound * pounds;

    	System.out.print( + pounds + " pounds is " + totalKilograms + " kilograms ");

    }


}