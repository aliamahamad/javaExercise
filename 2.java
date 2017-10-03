/**
 * @(#)menu.java
 *
 *
 * @author
 * @version 1.00 2015/12/16
 */


    import java.util.*;
    public class menu1{

    public void display_menu()
    {
    System.out.println("-----");
    System.out.println("1) senarai makanan \n2) senarai minuman \n3) senarai manisan \n4) pengambilan order \n5) keluar sistem ");
    System.out.print("Pilihan?: ");
    }
    public void question()
    {
    System.out.println("a) nasi putih + ayam penyet \nb) nasi putih + ikan keli \nc) nasi putih + ikan talapia");
    System.out.println("Untuk ke menu tekan 8");
    System.out.println("Untuk keluar sistem tekan 0.");
    Scanner q = new Scanner(System.in);
    switch (q.nextInt())
    {
    case 0:
    System.out.println ("Terima kasih dan selamat tinggal.");
    break;
    case 8:
    new menu1();
    break;
    default:
    System.err.println ( "Tiada dalam pilihan" );
    break;
    }
    }
    public void question2()
    {
    System.out.println("a) jus oren \nb) jus mangga \nc) jus tembikai");
    System.out.println("Untuk ke menu tekan 8");
    System.out.println("Untuk keluar sistem tekan 0.");
    Scanner q = new Scanner(System.in);
    switch (q.nextInt())
    {
    case 0:
    System.out.println ("Terima kasih dan selamat tinggal.");
    break;
    case 8:
    new menu1();
    break;
    default:
    System.out.println ( "Tiada dalam pilihan" );
    break;
    }
    }

    public menu1()
    {
    Scanner in = new Scanner(System.in);
    display_menu();
    switch (in.nextInt())
    {
    case 1:
    System.out.println ( "Pilihan 1" );
    question();
    break;
    case 2:
    System.out.println ( "Pilihan 2" );
    question();
    break;
    case 3:
    System.out.println ( "Pilihan 3" );
    question();
    break;
    case 4:
    System.out.println ( "Pilihan 4" );
    question();
    break;
    case 5:
    System.out.println ( "Pilihan 5" );
    question();
    break;
    default:
    System.err.println ( "Tiada dalam pilihan" );
    break;
    }
    }
    public static void main (String[]args)
    {
    new menu1();
    }
    }
