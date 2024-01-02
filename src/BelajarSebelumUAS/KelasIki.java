package BelajarSebelumUAS;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class KelasIki extends JFrame {
    private JPanel panelmain;
    private JList list1;
    private JTextField textFieldangkanegatif;

    private JButton buttonclear;
    private JButton buttonok;
    private JTextArea textAreaHasil;
    private JTextArea textAreaAngkanegatif;

    class Uas {
        private String angkanegatif;

        public String getangkanegatif() {
            return angkanegatif;
        }

        public void setAngkanegatif(String angkanegatif) {
            angkanegatif = angkanegatif;
        }

    }

    public KelasIki () {
      this.setContentPane(panelmain);
      this.setDefaultCloseOperation(EXIT_ON_CLOSE);
      this.pack();

        buttonclear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clearform();
            }
        });
        buttonok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    private void clearform () {

        textAreaAngkanegatif.setText("");
        textAreaHasil.setText("");

    }
    public static void main (String [] args){

        KelasIki kelasIki = new KelasIki();
        kelasIki.setVisible(true);



    }
}



