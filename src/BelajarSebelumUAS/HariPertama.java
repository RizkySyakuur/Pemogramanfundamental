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

/*
Mahasiswa
        package Data;

        import javax.swing.*;
        import java.awt.event.ActionEvent;
        import java.awt.event.ActionListener;
        import java.time.LocalDate;

public class Mahasiswa {
    private JComboBox cbhari;
    private JComboBox cbbulan;
    private JButton proses;
    private JTextField tfnama;
    private JComboBox cbtahun;
    private JPanel main;
    private JTextArea tralamat;
    private JLabel lbnama;
    private JLabel lbtanggalLahir;
    private JLabel lblamat;
    private JLabel lbusia;
    private JPanel secondmain;

    public JPanel getMain() {
        return main;
    }

    public Mahasiswa() {
        proses.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Biodata biodata = new Biodata();
                biodata.setNama(tfnama.getText());
                biodata.setTanggalLahir(
                        Integer.parseInt((String) cbtahun.getSelectedItem()),
                        cbbulan.getSelectedIndex() + 1,
                        Integer.parseInt((String) cbhari.getSelectedItem())
                );
                biodata.setAlamat(tralamat.getText());

                lbnama.setText(": " + biodata.getNama());
                lbtanggalLahir.setText(": " + biodata.getTanggalLahir());
                lblamat.setText(": " + biodata.getAlamat());
                lbusia.setText(": " + biodata.calculateUmur());
            }
        });
    }
}







package Data;

import javax.swing.*;

public class RunMahasiswa {
    public static void main(String[] args) {
        JFrame data = new JFrame("Data Mahasiswa");
        data.setContentPane(new Mahasiswa().getMain());
        data.setSize(1920, 1080);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setVisible(true);
    }
 */


/*Biodata.java
        package Data;

        import java.time.LocalDate;
        import java.time.Period;

public class Biodata {
    private String nama;
    private LocalDate tanggalLahir;
    private String alamat;

    public String calculateUmur() {
        LocalDate currentDate = LocalDate.now();
        Period usia = Period.between(tanggalLahir, currentDate);
        return usia.getYears() + " tahun, " + usia.toTotalMonths() + " bulan, " + usia.getDays() + " hari.";
    }

    // Getter and Setter methods
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public LocalDate getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(int tahun, int bulan, int tanggal) {
        this.tanggalLahir = LocalDate.of(tahun, bulan, tanggal);
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) { this.alamat = alamat;
    }
}*/



