package BelajarSebelumUAS;
import java.util.Scanner;
public class Latihan {
    public static void main (String [] args){
         //  -----------------------------------------------------------------
       //  | INI ADALAH CONTOH PENGGUNAAN WHILE DENGAN SCANNER DAN KONDISI |
         //  -----------------------------------------------------------------


       /* System.out.print("Berapa kah angka di samping = ");
        Scanner userInput = new Scanner(System.in);
        int angka  = userInput.nextInt();

        boolean kondisi = true;

        while ( kondisi ) {

            angka++;
            System.out.println("Ini adalah angka ke = " + angka);
            if (angka == 10) {
                kondisi = false;

            }
        } */


      //  ---------------------------------------------
     // INI ADALAH CONTOH PENGGUNAAN DO WHILE


        System.out.println("Ini adalah awal program");
        Scanner userInput = new Scanner(System.in);
        int angka = userInput.nextInt() ;

        boolean kondisi = true ;
         do {


            angka++;
             System.out.println("Ini adalah angka ke = " + angka);

             if (angka == 10) {
                 kondisi = false ;
             }
         } while (kondisi);















    }

}
