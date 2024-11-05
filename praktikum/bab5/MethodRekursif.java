public class MethodRekursif {
    static int factorial(int n) {
        if (n == 0) {
            return 1;
        } else { //
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {

        // Memanggil metode rekursif
        int result = factorial(5);
        System.out.println("Faktorial dari 5 adalah: " + result);
    }

}
