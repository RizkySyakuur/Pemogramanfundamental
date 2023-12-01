package Tugas3;
import  java.util.Scanner;
public class KonversiWaktuMall {
    public static void main(String[]afd){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to Mall UIN SUSKA");
        System.out.println("Masukkan Waktu");

        double waktu = sc.nextDouble();
        if(waktu ==07.00){
            System.out.println("Pintu Barat");

        } else if(waktu==10.00) {
            System.out.println("Pintu Timur");

        } else if(waktu==14.00) {
            System.out.println("Pintu Utara");

        } else if(waktu==17.00) {
            System.out.println("Pintu selatan");

        } else {
            System.out.println("pintu di tutup");
        }
    }
}
