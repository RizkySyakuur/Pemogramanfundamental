package BelajarSebelumUAS;
import java.util.Scanner;

                //BELAJAR MENGHITUNG OPERATOR
public class HariKedua {
    public static void main (String [] args){

        System.out.println("MENGHITUNG PERSAMAAN KUADRAT");

        Scanner userInput = new Scanner (System.in);
        int x,y,z;
        System.out.print("Huruf x = ");
        x = userInput.nextInt();

        System.out.print("Huruf y = ");
        y = userInput.nextInt();

        System.out.print("Huruf z = ");
        z = userInput.nextInt();



        int result = x * y + z;
        System.out.println("Hasil " + result);

        






    }
}
