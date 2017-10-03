//To calculate area of triangle

import java.util.Scanner;

public class triangle {

    public static void main (String [] args) {

    	Scanner input = new Scanner (System.in);

    	System.out.println("THIS IS DATA FROM USER");
    	System.out.print("Enter height :");
    	double height = input.nextDouble();


    	System.out.print("Enter base :");
    	double base = input.nextDouble();

    	double area = (base * height)/2;

    	System.out.println ("\nTHE OUTPUT");
    	System.out.println("Base of triangle :"+base +"\nHeight of triangle :"+height +" \nAnd area of triangle is :" +area);







    }


}