import java.util.*;

public class While {
    public static void main(String[] args) {
        /*
         * while (kondisi) {
         *      statement1;
         *      statement2;
         *      ...
         *      statementN;
         * }
         */

        // instansiasi Scanner 
        Scanner input = new Scanner(System.in);

        // konstanta PI untuk menghitung luas lingkaran
        final double PI = 3.14;

        // meminta input jari-jari (r) dari user
        double r = input.nextDouble();

        // looping akan terjadi selama nilai r < 0
        while (r < 0) {
            System.out.println("input invalid, masukkan nilai baru");

            // program akan meminta input r yang baru
            r = input.nextDouble();

            // apabila r < 0, looping akan terjadi lagi
            // apabila r >= 0, looping akan berhenti
        }

        // print luas lingkaran
        System.out.println(PI * r * r);
    }
}
