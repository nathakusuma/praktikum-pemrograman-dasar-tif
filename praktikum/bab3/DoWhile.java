import java.util.*;

public class DoWhile {
    public static void main(String[] args) {
        /*
         * do {
         *      statement1;
         *      statement2;
         *      ...
         *      statementN;
         * } while (kondisi);
         */

        // instansiasi Scanner 
        Scanner input = new Scanner(System.in);

        // konstanta PI untuk menghitung luas lingkaran
        final double PI = 3.14;

        // deklarasi jari-jari dengan variable r
        double r;

        // program akan menjalankan bagian do setidaknya satu kali
        do {
            // meminta input dari user
            r = input.nextDouble();

            // jika r < 0, print pesan invalid
            if (r < 0) {
                System.out.println("input invalid, masukkan nilai baru");
            }
        } while (r < 0); 
        // jika r < 0 bernilai true, jalankan lagi do
        // jika false, lanjut eksekusi kode di bawah

        // print luas lingkaran
        System.out.println(PI * r * r);
    }
}
