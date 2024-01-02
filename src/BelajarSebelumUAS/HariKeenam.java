package BelajarSebelumUAS;
import java.util.Scanner;
public class HariKeenam {
    public static void main ( String []args ){

        // HARI INI KITA BELAJAR LOOPING SEDERHANA DENGAN MENGGUNAKAN WHILE LOOP

        System.out.println("Ini adalah awal program");

        Scanner userInput = new Scanner(System.in);
        int nilaiAwal, nilaiAkhir, total;

        System.out.print("Masukkan nilai awal = ");
        nilaiAwal = userInput.nextByte();

        System.out.print("Masukkan nilai akhir = ");
        nilaiAkhir = userInput.nextByte();


        total= 0;
        while (nilaiAwal <= nilaiAkhir){
            total = total+nilaiAwal;
            System.out.println("Ditambah " + nilaiAwal + "Menjadi" + total );

            nilaiAwal++;

        }




    }
}
