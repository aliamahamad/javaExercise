import java.io.*;

public class question2 {

    public static void main(String args[]) throws IOException {
    	DataInputStream io = new DataInputStream (System.in);
    	int number, max;

    	number = Integer.ParseInt(io.readLine());
    	max = number;

    	While (number != 0);{
    		number = Integer.parseInt(io.readLine());
    		if(number > max)
    			max = number;
    	}

    	System.out.print("max is: " + max);
    	System.out.print("num is: " + max);
	}

}