package BelajarSebelumUAS;
import java.util.Scanner;
public class HariKeenamLatihan {
    public static void main (String [] args){
        System.out.println("Ini adalah awal program Iky");
        Scanner userInput = new Scanner (System.in);

        int nilaiAwal, nilaiAkhir, total;

        System.out.print("Masukkan nilai awal = ");
        nilaiAwal = userInput.nextInt();

        System.out.print("Masukkan nilai akhir = ");
        nilaiAkhir = userInput.nextInt();

        total = 0;
        while (nilaiAwal<=nilaiAkhir){

            total = nilaiAwal + total;

            System.out.println("Ditambah " + nilaiAwal + " Menjadi " + total);

            nilaiAwal++;

        }

        System.out.println("Ini adalah akhir program");

    }
}
