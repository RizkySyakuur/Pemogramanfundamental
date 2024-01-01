package BelajarSebelumUAS;

import java.util.Scanner;

public class HariKetiga2 {
    public static void main (String [] args) {
        System.out.println("Ini adalah tarif bioskop mini iki");
        System.out.print("Silahkan bayar = ");
        Scanner userInput = new Scanner(System.in);
        int iki = userInput.nextInt();

        System.out.println("  harga bioskop " + iki);

        if ( iki == 20000) {
            System.out.println("Selamat anda boleh masuk tetapi");
            System.out.println("Hanya perempuan yang boleh nonton  ");

        } else if ( iki == 30000 ) {
            System.out.println("Selamat anda boleh masuk tetapi");
            System.out.println("Hanya lakilaki yang boleh nonton");

        } else {
            System.out.println("mana ada harga bioskop segitu ");
            System.out.println("Pergi lah sana cari bioskop yang lebih murah");

        }
    }
}
