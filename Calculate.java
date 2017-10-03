import java.util.Scanner;

public class Calculate {

    public static void main (String [] args) {

    	Scanner input = new Scanner (System.in);

    	int sum, x;

    	x = 1;
    	sum = 0;
    	while (x<=10)

    	{
    		sum += x;
    		++x;

    		System.out.println("The sum is " +sum);
    	}
    	}
    }