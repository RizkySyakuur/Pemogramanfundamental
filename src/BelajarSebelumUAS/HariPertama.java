package BelajarSebelumUAS;
import java.util.Scanner;
public class HariPertama {
    public static void main(String[] args) {

        // membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar

        Scanner sc = new Scanner(System.in);

        System.out.print("Panjang =");
        int panjang = sc.nextInt();
        System.out.print("lebar =");
        int lebar = sc.nextInt();

        int luas = panjang * lebar;

        System.out.println("luas =" + luas);
        
    }
}
