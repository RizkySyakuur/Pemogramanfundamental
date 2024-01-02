package UAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UAS {
    private JPanel main;
    private JButton tekan;
    private JTextArea angka;
    private JLabel total;

    public JPanel getMain() {
        return main;
    }
    public UAS() {
        tekan.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                AngkaGanjil data = new AngkaGanjil();

                angka.setText(data.getUrutanAngka());
                total.setText(String.valueOf(data.getTotalJumlah()));

                System.out.println(data.getUrutanAngka());
            }
        });
    }
}

