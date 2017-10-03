/**
 * @(#)display.java
 *
 *
 * @author
 * @version 1.00 2016/3/21
 */
import java.util.Scanner;

public class display {

    public static void main(String[] args) {
    	Scanner input = new Scanner (System.in);

    	// declare variable
    	int a;
    	int b;

    	// get numbber from user
    	System.out.println("Enter number 1: ");
    	a = input.nextInt();

    	System.out.println("Enter number 2: ");
    	b = input.nextInt();

    	int total = calculateTotal(a,b);

    	//Display total
    	System.out.print("The total is: " + total);
    }

    public static int calculateTotal (int a, int b){

    	int calculateTotal = a % b; // to calculate addition

    	return calculateTotal;
    }

}