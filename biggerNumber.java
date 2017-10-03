import java.util.Scanner;

public class biggerNumber {

    public static void main (String [] args) {
    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter number1: ");
    	int num1 = input.nextInt();

    	System.out.print("Enter number2: ");
    	int num2 = input.nextInt();

    	if (num1>num2)
    		System.out.print(num1+" is bigger than "+num2);
    		else if (num2 >num1)
    			System.out.print(num2+" is bigger than "+num1);
    			else
    				System.out.print(num1+" is equal to "+num2);
    }



}