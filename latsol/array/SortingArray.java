/*
 * diberikan sebuah bilangan n.
 * diberikan banyak bilangan m sebanyak n.
 * urutkan bilangan-bilangan m, lalu outputkan satu persatu.
 */

import java.util.Scanner;

public class SortingArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();

        // membuat array sebanyak n element
        int[] m = new int[n];

        for (int i = 0; i < n; i++) {
            // memasukkan tiap bilangan ke dalam elemen array
            // ingat, array mulai dari 0
            m[i] = input.nextInt();
        }

        // algoritma sorting (bubble sort)
        // looping setiap elemen array
        for (int i = 0; i < n; i++) {
            // looping setiap elemen array mulai dari i hingga n - 1
            for (int j = i; j < n; j++) {
                // jika array ke-j lebih kecil dari array ke-i
                // tukar nilainya, supaya urut dari kecil
                if (m[j] < m[i]) {
                    // simpan array ke-i pada variable temp
                    // ganti array ke-i dengan array ke-j yang lebih kecil
                    // ganti array ke-j dengan nilai temp
                    int temp = m[i];
                    m[i] = m[j];
                    m[j] = temp;
                }
            }
        }

        // print array dari awal sampai akhir
        for (int i = 0; i < n; i++) {
            System.out.print(m[i] + " ");
        }

        System.out.println();
    }
}
