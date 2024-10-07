public class NestedForLoop {
    public static void main(String[] args) {
        int tinggi = 9;
        for (int i = 1; i <= tinggi; i++) {
            // print whitespace
            for (int j = tinggi; j > i; j--) {
                System.out.print(" ");
            }

            // print asterisk
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }

            // pindah ke baris berikutnya
            System.out.println();
        }
    }
}
