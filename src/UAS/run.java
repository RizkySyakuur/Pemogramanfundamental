package UAS;

import javax.swing.*;

public class run {
    public static void main(String[] args) {
        JFrame data = new JFrame("Form Bilangan Ganjil" );
        data.setContentPane(new UAS().getMain());
        data.setSize(640, 400);
        data.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        data.setVisible(true);
    }

}
