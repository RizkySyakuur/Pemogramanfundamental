package Sololearn.ControlFlow;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        //your code goes here
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        while(num > 0 ){
            sum += num--;
        }
        System.out.println(sum);
    }
}
