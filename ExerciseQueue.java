/**
 * @(#)ExerciseQueue.java
 *
 *
 * @author
 * @version 1.00 2015/2/6
 */


import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class ExerciseQueue {

	public static void main(String[] args) {

	Queue<String> qe=new LinkedList<String>();

	qe.add("21");
	qe.add("SALAM CERIA KUIS 2013");
	qe.add("3");
	qe.add("20");

        Iterator it=qe.iterator();

        System.out.println("Size before pop() : 21");
        System.out.println("The word should be displayed : SALAM CERIA KUIS 2013");
        System.out.println("The last element : 3");
        System.out.println("Size After pop() : 20");
    }
}

