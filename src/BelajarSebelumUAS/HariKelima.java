package BelajarSebelumUAS;

public class HariKelima {
    public static void main (String [] args){
        System.out.println("Ini adalah awal program belajar DO WHILE");

        int a = 0;

        boolean kondisi = true;
        do {
          a++;
            System.out.println("umur iki berapa tahun = " + a );

            if (a == 10){
                kondisi = false;
            }
        } while (kondisi);

            //System.out.println("ini adalah akhir program");


    }
}
