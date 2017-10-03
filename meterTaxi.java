/**
 * @(#)meterTaxi.java
 *
 *
 * @author
 * @version 1.00 2014/12/16
 */


import java.util.Scanner;
public class meterTaxi{

	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);

     String[] meterTaxi = {"RM 1 setiap 1km",
                          "Selepas pukul 8pm,akan dicaj rm 3",
                          "Selepas pukul 12pm,akan dicaj rm 5"};
     for (int i=0;i<meterTaxi.length;i++){
     	System.out.println((i+1)+". "+meterTaxi[1]);
     }
     System.out.println ("Berapa kilometer ?");
     double jarak =input.nextDouble();
     System.out.println ("Pukul berapa?");
     double jam=input.nextDouble();
     if((jam>=8)&&(jam<=11)){
     	double jumlahtambang =1*jarak+3;
     	System.out.println("Jumlah tambang teksi ialah RM "+jumlahtambang);
     }
     else if(jam ==12){
     	double jumlahtambang=1*jarak+5;
     	System.out.println("Jumlah tambang teksi ialah RM "+jumlahtambang);
     }
     else{
     	double jumlahtambang =1*jarak;
     	System.out.println("Jumlah tambang teksi ialah RM "+jumlahtambang);
     }



	}

	}