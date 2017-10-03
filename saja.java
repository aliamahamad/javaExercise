/**
 * @(#)saja.java
 *
 *
 * @author
 * @version 1.00 2016/4/1
 */


public class saja {

    public static void main(String[] args) {

    	int i = 1, j = 1;

    	System.out.println("Tables");

    	while(i <= 2)
    	{
    		while(j <= 5)
    		{
    			System.out.println(i + " * " + j + " = " + (i * j));
    			j++;
    		}
    		i++;
    		System.out.println("");
    		System.out.println("");
    	}
    }
}