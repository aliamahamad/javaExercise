/**
 * @(#)StackDemo1.java
 *
 *
 * @author
 * @version 1.00 2015/1/2
 */

import java.util.Stack;
public class StackDemo1 {

public static void main(String args[]){

	int numStack;

	Stack lifo =new Stack();

	System.out.println("LIST OF NUMBERS IN STACK :");
	System.out.println("========================== ");

	for (int i = 0; i <= 9; i++){
 		lifo.push (new Integer (i+3));

	}
	while ( !lifo .empty ()){
		System.out.println (lifo.pop ());
	}
	System.out.println("END PROGRAM");

    }


}