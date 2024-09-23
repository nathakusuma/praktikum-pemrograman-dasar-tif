public class NestedIf {
    public static void main(String[] args) {
        int panjang = 0;
        int lebar = 10;

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
    }
}
