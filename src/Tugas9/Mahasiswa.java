package Tugas9;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.time.Period;

public class Mahasiswa extends JFrame {
    private JPanel panelmain;
    private JTextField tfnama;
    private JComboBox Tanggal;
    private JComboBox Tahun;
    private JTextField tfalamat;
    private JButton PROSES;
    private JComboBox Bulan;
    private JTextArea textArea1Nama;
    private JTextArea textArea2Usia;
    private JTextArea textArea3Alamat;
    private JTextArea textArea4TanggalLahir;

    public Mahasiswa() {
        this.setContentPane(panelmain);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();

        PROSES.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama =  tfnama.getText();
                int tlTanggal = Integer.parseInt((String) Tanggal.getSelectedItem());
                int tlBulan = Bulan.getSelectedIndex() + 1;
                int tlTahun = Integer.parseInt((String) Tahun.getSelectedItem());
                String alamat = tfalamat.getText();

                LocalDate sekarang = LocalDate.now();
                LocalDate tanggalLahir = LocalDate.of(tlTahun, tlBulan, tlTanggal);
                Period period = Period.between(tanggalLahir, sekarang);

                int tahun = period.getYears();
                int bulan = period.getMonths();
                int tanggal = period.getDays();

                textArea1Nama.setText("Nama              :" + " " + nama);
                textArea4TanggalLahir.setText("Tanggal Lahir           :" + " " + tlTanggal + " " + Bulan.getSelectedItem() + " " + tlTahun);
                textArea3Alamat.setText("Alamat              :" + " " + alamat);
                textArea2Usia.setText("Usia          : " + tahun + " Tahun " + bulan + " Bulan " + tanggal + " Hari");
            }
        });
    }

    public static void main(String[] args) {
        Mahasiswa Mahasiswa = new Mahasiswa();
        Mahasiswa.setVisible(true);
    }
}
