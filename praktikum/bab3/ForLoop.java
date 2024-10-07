import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        /*
         * for (inisialisasi; kondisi; ekspresi_iterasi) {
         * statement1;
         * statement2;
         * ...
         * }
         */

        // instansiasi scanner
        Scanner input = new Scanner(System.in);

        // input dari user
        int n = input.nextInt(); 

        // inisialisasi dengan nilai awal i = 0
      	// looping selama nilai i <= n
        for (int i = 0; i <= n; i++) {
            // setiap iterasi, n bertambah 1
            System.out.println(i);
        }
    }
}
