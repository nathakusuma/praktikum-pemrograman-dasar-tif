public class NestedIf {
    public static void main(String[] args) {
        int panjang = 0;
        int lebar = 10;

        /*
         * Nested If (menggunakan curly brackets)
         */

        // outer if
        if (panjang > 0 && lebar > 0) {
            System.out.println(panjang * lebar);
        } else {
            // inner if
            if (panjang == 0 || lebar == 0) {
                System.out.println(0);
            } else {
                System.out.println("Error!");
            }
        }

        /*
         * Nested Simple If (tanpa curly brackets)
         */

        if (panjang < 0 || lebar < 0)
            if (panjang == 0 || lebar == 0)
                System.out.println(0);
            else
                System.out.println("Error");
    }
}
