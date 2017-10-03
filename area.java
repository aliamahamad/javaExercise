/**
 * @(#)area.java
 *
 *
 * @author
 * @version 1.00 2016/4/1
 */
import java.util.Scanner;

public class area {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	System.out.print("Enter width: ");
    	int w = input.nextInt();
    	System.out.print("Enter length: ");
    	int l = input.nextInt();

    	calculateArea(w, l);
    }
    public static void calculateArea(int width, int length){
    	// calculate area using formula
    	int area = width * length;

    	System.out.print("The area is " + area);
    }

}