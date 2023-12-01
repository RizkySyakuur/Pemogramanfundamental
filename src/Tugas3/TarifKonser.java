package Tugas3;
import  java.util.Scanner;
public class TarifKonser {
    public static void main(String[]afd){
        Scanner sc = new Scanner(System.in);
        System.out.println("welcome to konser Rizky Kiw Kiw cukurukuk");
        System.out.println("Masukkan Tarif");

        int tarif = sc.nextInt();
        if(tarif==80000){
            System.out.println("Dewasa");

        } else if(tarif ==70000) {
            System.out.println("Remaja");

        } else if(tarif==60000) {
            System.out.println("anak-anak");

        } else if(tarif==50000) {
            System.out.println("Balita");

        } else {
            System.out.println("error");
        }
    }
}
