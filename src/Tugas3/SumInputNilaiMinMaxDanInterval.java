package Tugas3;
import java.util.Scanner;
public class SumInputNilaiMinMaxDanInterval {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("input Max: ");
        int max = scanner.nextInt();

        System.out.print("input Min: ");
        int min = scanner.nextInt();

        System.out.print("input Interval: ");
        int interval = scanner.nextInt();

        if ((max - min) % interval == 0) {
            int n = (max - min) / interval;
            int i = 1;
            int sum = 0;

            while (i <= n) {
                sum =  sum + min;
                min = min + interval;
                i = i + 1;
            }

            System.out.println("Total Sum: " + sum);
        } else {
            System.out.println("Sum tidak terdeteksi");
        }
    }
}
