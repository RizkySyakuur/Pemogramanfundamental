package Tugas3;
import java.util.Scanner;
public class KelilingLingkaran {
    public static void main(String[]afd){
        Scanner sc = new Scanner(System.in);
        double jarijari,hasil;
        double phi = 3.14;
        System.out.println("kiwkiw cukurukuk");
        System.out.println("menghitung keliling lingkaran");

        System.out.print("masukkan jarijari: ");
        jarijari = sc.nextDouble();

        hasil = 2 *phi*jarijari ;
        System.out.println("keliling lingkaran tersebut adalah: " + hasil);
    }
}
