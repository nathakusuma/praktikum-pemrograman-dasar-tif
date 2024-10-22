import java.util.Scanner;

/*
 * diberikan input sebuah bilangan n. 
 * kemudian diberikan input banyak bilangan m sebanyak n. 
 * tampilkan kembali bilangan-bilangan tersebut dari belakang ke depan.
 */

public class ReverseArray {
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
        
        // looping dari belakang, mulai dari n - 1 hingga 0
        // kenapa kok n - 1? karena array mulai dari 0 hingga n - 1
        for (int i = n - 1; i >= 0; i--) {
            // print nilai array tiap iterasi
            System.out.print(m[i] + " ");
        }

        System.out.println();
    }
}
