package Tugas3;
import  java.util.Scanner;
public class NilaiIndex {
    public static void main(String[]afd){
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai");
        int nilai = sc.nextInt();

        if(nilai>=80 && nilai <=100){
            System.out.println("A");
            System.out.println("4.0");
        } else if(nilai>=70 && nilai<80) {
            System.out.println("B");
            System.out.println("3.0");
        } else if(nilai>=60 && nilai<70) {
            System.out.println("C");
            System.out.println("2.0");
        } else if(nilai>=50 && nilai<60) {
            System.out.println("D");
            System.out.println("1.0");
        } else if(nilai>=0 && nilai<50) {
            System.out.println("E");
            System.out.println("0");
        } else {
            System.out.println("tidak valid");
        }
    }
}
