/**
 * @(#)StackExample.java
 *
 *
 * @author
 * @version 1.00 2017/1/24
 */
import java.util.Iterator;
import java.util.Stack;


public class StackExample {

    public static void main(String[] args) {

    	Stack<String> sk = new Stack<String>();

    	sk.push("S");
    	sk.push("Y");
    	sk.push("A");
    	sk.push("W");
    	sk.push("A");
    	sk.push("L");
    	sk.push(" ");
    	sk.push("R");
    	sk.push("I");
    	sk.push("A");
    	sk.push(" ");
    	sk.push("K");
    	sk.push("U");
    	sk.push("I");
    	sk.push("S");
    	sk.push(" ");
    	sk.push("2");
    	sk.push("0");
    	sk.push("1");
    	sk.push("6");

    	Iterator it = sk.iterator();

    	System.out.println("Size before pop(): " +sk.size());

    	System.out.print("The word should displayed: ");
    	while(it.hasNext()){
    		String iValue = (String)it.next();
    		System.out.print(iValue);
    	}

    	//get and remove last element from stack
    	String value = (String)sk.pop();

    	System.out.println("\nThe last and top element: " + value);

    	System.out.println("Size After pop(): " + sk.size());

    }


}