package Latihan;
import java.util.Calendar;
import java.util.Date;

    public class RunBiodata {

        public static void main(String[] args){



            Biodata mahasiswa1 = new Biodata("Adjie Putra Ramdhani", "JL. Beringin", new Date());

            System.out.println("Nama Mahasiswa : " + mahasiswa1.getNama());
            System.out.println("Alamat Mahasiswa : " + mahasiswa1.getAlamat());
            System.out.println("Tanggal Lahir Mahasiswa : " + mahasiswa1.getTanggalLahir());
        }
}
