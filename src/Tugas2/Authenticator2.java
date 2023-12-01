package Tugas2;
import javax.swing.JOptionPane;
public class Authenticator2 {
    public static void main(String args[]) {
        String username = JOptionPane.showInputDialog("Username:");
        String password = JOptionPane.showInputDialog("Password:");
        if ( (
                (username.equals("rizky") && password.equals("339944")) ||
                        (username.equals("syakuur") && password.equals("339944"))
        )
        )
        {
            JOptionPane.showMessageDialog(null, "You're in.");
        } else {
            JOptionPane.showMessageDialog(null, "You're suspicious.");
        }

    }
}
