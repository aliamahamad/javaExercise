/**
 * @(#)exercise1.java
 *
 *
 * @author
 * @version 1.00 2015/1/1
 */

import java.util.*;
public class exercise1 {

public static void main(String[]args){

Queue<Integer> q = new
Queue<Integer>();
q.enqueue(0);
q.enqueue(1);
for (int i = 0; i < 10; i++) {
int a = q.dequeue();
int b = q.dequeue();
q.enqueue(b);
q.enqueue(a + b);
System.out.println(a);
}

    }


}