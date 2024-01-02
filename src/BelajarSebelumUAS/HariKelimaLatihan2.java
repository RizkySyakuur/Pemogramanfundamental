package BelajarSebelumUAS;
import java.util.Scanner;

public class HariKelimaLatihan2 {
    public static void main (String [] args){
        System.out.println("SELAMAT DATANG");
        System.out.println("Ini adalah raport mini pak iky");
        System.out.print("Masukkan Huruf = ");
        Scanner userInput = new Scanner (System.in);
        String huruf = userInput.nextLine();

        if (huruf.equals("A")){
            System.out.println("Selamat anda mendapatkan index = 4.0");
        } else if (huruf.equals("B")) {
            System.out.println("Selamat anda mendapatkan index = 3.0");
        } else {
            System.out.println("alamak tinggal kelas nih nampaknya");




        }
    }
}
