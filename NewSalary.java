// To accept salary and total year service from employee

import java.util.Scanner;


public class NewSalary {

    public static void main (String [] args) {

    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter total year service: ");
    	double service = input.nextDouble();

    	double newsalary = service * 5/100;
    	double newsalary2 = service * 8/100;
    	double newsalary3 = service * 10/100;


    	if (service<=5)
    		System.out.print("New salary with 5% increament: "+newsalary);


    		else if (6<=10)
    			System.out.print("New salary with 8% increment: "+newsalary2);

    			else if (service>9)
    				System.out.print("New salary with 10% increament: "+newsalary3);

    				else
    					System.out.print("wrong");



    }


}