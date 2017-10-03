/**
 * @(#)Program_3.java
 *
 *
 * @author
 * @version 1.00 2016/2/10
 */
import java.util.Scanner;

public class Program_3 {

    public static void main(String[] args) {

    int productNo = 0;
    double product1;
    double product2;
    double product3;
    double product4;
    double product5;
    int quantity;

    double totalSales = 0;

    while(productNo != 0)

    	System.out.println("Enter product number 1-5 ");
    	productNo = input.nextInt();

    	System.out.println("Enter quantity sold ");
    	quantity = input.nextInt();

    	switch (productNo){

    		case 1: product1 = 2.98;
    		totalSales = (2.98 * quantity);
    		break;

    		case 2: product2 = 4.50;
    		totalSales += (4.50 * quantity);
    		break;

    		case 3: product3 = 9.98;
    		totalSales += (9.98 * quantity);
    		break;

    		case 4: product4 = 4.49;
    		totalSales += (4.49 * quantity);
    		break;

    		case 5: product5 = 6.87;
    		totalSales += (6.87 * quantity);
    		break;
    	}

    	System.out.println(totalSales);
    }
}