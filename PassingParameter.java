/**
 * @(#)PassingParameter.java
 *
 *
 * @author
 * @version 1.00 2016/3/7
 */


public class PassingParameter {

    public static void main(String[] args) {
    	int count = 6;
    	printHello("Hello", count);
    }

    public static void printHello(String message, int n){
    	for (int i = 0; i < n; i++)
    		System.out.println(message);
    }
}