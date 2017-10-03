import java.util.Scanner;

public class ConvertFeetIntoMeters {

    public static void main(String[] args) {

    	Scanner input = new Scanner(System.in);

    	double foot = 0.305;

    	System.out.print("Enter a value for feet: ");
    	double feet = input.nextDouble();

    	double totalFeet = feet * foot;

    	System.out.print( + feet + " feet is " + totalFeet + " meters ");
    }


}