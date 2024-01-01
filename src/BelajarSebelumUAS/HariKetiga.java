package BelajarSebelumUAS;
import java.util.Scanner;
public class HariKetiga {
    // BELAJAR IF ELSE STATEMENT
    public static void main (String [] args){
        Scanner userInput = new Scanner (System.in);

        System.out.println("Ini merupakan index kebenaran dari kegantengan iki");

        System.out.print("Berapa sih kegantengan iki = ");
        int a = userInput.nextInt();

        System.out.println("Jika Nilai kegantengan iki = " + a);

        if (a %2== 0) {
            System.out.println("Maka iki banyak yang tertarik");
        }
        else  {
            System.out.println("Maka itu bukan iki");

        }






    }
}
