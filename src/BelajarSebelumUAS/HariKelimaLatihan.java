package BelajarSebelumUAS;
import java.util.Scanner;

public class HariKelimaLatihan {
    public static void main (String [] args){

        System.out.println ("Ini Konser coldplay UIN SUSKA RIAU");
        System.out.print("Masukkan Harga = ");

        Scanner userInput = new Scanner (System.in);

        int tarif = userInput.nextInt();

        if (tarif==8000) {
            System.out.println("Ini adalah tiket masuk untuk orang dewasa");
        } else if (tarif==10000){
            System.out.println("ini adalah tiket masuk untuk dua orang dewasa");
        } else if (tarif==12000){
            System.out.println("Ini adalah tiket masuk untuk tiga orang dewasa");
        }

        else {
            System.out.println("Error");
        }

    }
}
