package Sololearn.Arrays;

public class revenue {
    public static void main(String[] args) {
        double[] revenue = {88750, 125430, 99700, 14500, 158000, 65000, 99000, 189000, 210000, 42000, 165800, 258900};
        //your code goes here
        double sum = 0;
        for(double x: revenue) {
            sum += x;
        }
        System.out.println(sum/12);
    }
}
