/*
 * diberikan sebuah bilangan n pada input pertama.
 * setelahnya, diberikan banyak bilangan m sebanyak n.
 * terakhir, akan ada sebuah bilangan x.
 * outputkan sebuah bilangan pada urutan ke x dari banyak bilangan yang ada.
 * urutan dimulai dari 1.
 */

import java.util.Scanner;

public class ArrayKeX {
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
        
        int x = input.nextInt();

        // outputkan banyak bilangan m pada urutan ke x
        // kenapa kok x - 1? karena urutan dimulai dari 1, sementara array dimulai dari 0
        System.out.println(m[x - 1]);
    }
}
