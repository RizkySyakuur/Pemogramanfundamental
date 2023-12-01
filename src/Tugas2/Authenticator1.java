package Tugas2;
import static java.lang.System.out;
import java.util.Scanner;
public class Authenticator1 {
    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);

        System.out.print ("Username: ");
        String username = keyboard.next();

        if (username.equals("mamak")) {
            System.out.print("Password: ");
            String password = keyboard.next();

            if (password.equals("123")) {
                System.out.println("You're in my heart.");
            } else {
                System.out.println("Incorrect password");
            }
        } else {
            System.out.println("Unknown user");
        }
        keyboard.close();
    }
}
