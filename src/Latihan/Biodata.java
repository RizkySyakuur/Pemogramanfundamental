package Latihan;

import java.util.Date;
    public class Biodata {

        public String nama;
        public String alamat;
        public Date tanggalLahir;

        public Biodata(String nama, String alamat, Date tanggalLahir){
            this.nama = nama;
            this.alamat = alamat;
            this.tanggalLahir = tanggalLahir;
        }

        public String getNama(){
            return nama;
        }
        public void setNama(String nama){
            this.nama = nama;
        }
        public String getAlamat(){
            return alamat;
        }
        public void setAlamat(String alamat) {
            this.alamat = alamat;
        }
        public Date getTanggalLahir() {
            return tanggalLahir;
        }
        public void setTanggalLahir(Date tanggalLahir) {
            this.tanggalLahir = tanggalLahir;
        }

}
