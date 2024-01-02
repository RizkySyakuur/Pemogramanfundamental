package BelajarSebelumUAS;
import java.util.Scanner;

public class LatihanArrayForEach {
    public static void main (String []args){
        System.out.print("jumlah data = ");
        Scanner userInput = new Scanner(System.in);
        int a = userInput.nextInt();

        int [] angka = {2,3,10,9,19,4};

        System.out.println("Inputkan data berikut");

      //  int [] angka = new int[a];
      //  int total = 0;
        for ( int i = 0 ; i <angka.length ; i++) {
            System.out.println("Data ke " + i + " adalah =" + angka[i]);
        }


            System.out.println("menampilkan data ");

            for (int y = 0 ; y <angka.length ; y++) {
                int data = angka[y] % 2;

             if (data == 0 ){
                    System.out.println(angka[y] + "--> genap ");

                }else {
                        System.out.println(angka[y] + "--> ganjil ");
                    }

            }
           /* angka += angka [y];

        double rataRata = (double) angka / angka.length;

        System.out.println("TOTAL PENJUMLAHAN: " + angka);
        System.out.println("RATA-RATA: " + rataRata);*/

    }
}
