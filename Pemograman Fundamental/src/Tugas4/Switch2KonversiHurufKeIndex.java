package Tugas4;
import java.util.Scanner;
public class Switch2KonversiHurufKeIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Inputkan Nilai Angka : ");
        double angka = sc.nextDouble();

        switch ((int) (angka / 10.0)) {
            case 10:
            case 9:
            case 8:
                System.out.print("Nilai Huruf : A");
                break;
            case 7:
                System.out.print("Nilai Huruf : B");
            case 6:
                System.out.print("Nilai Huruf : C");
                break;
            case 5:
                System.out.print("Nilai Huruf : D");
                break;
            case 4:
            case 3:
            case 2:
            case 1:
            case 0:
                System.out.print("Nilai Huruf : E");
                break;
            default:
                System.out.print("NIlai angka tidak terdeteksi.");
                break;
        }
    }
}
