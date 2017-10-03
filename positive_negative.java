import java.util.Scanner;

public class positive_negative {

	public static void main (String [] args) {

		Scanner input = new Scanner (System.in);

		int num1, num2, num3, num4, num5;
		int total, positive, negative;
		double average;

		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
		System.out.println ("Enter an integer, the input ends if it is 0: ");

		//Average

		num1 = input.nextInt();
		num2 = input.nextInt();
		num3 = input.nextInt();
		num4 = input.nextInt();
		num5 = input.nextInt();
		average = ( num1 + num2 + num3 +num4 +num5) / 5;
		System.out.print("The average is "+average);

	    //Total

	    System.out.print("The total is " +average/( num1 + num2 + num3 +num4 +num5));


	}
}