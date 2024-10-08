public class Continue {
    public static void main(String[] args) {
        int total = 0;

        // looping dari 0 hingga 100 (inklusif)
        for (int i = 0; i <= 100; i++) {
            
            // jika bilangan ganjil, skip
            if (i % 2 != 0) {
                continue;
            }

            // selain itu, tambahkan value ke total
            total += i;
        }

        // print hasil penjumlahan semua bilangan genap
        System.out.printf("hasil penjumlahan bilangan genap: %d\n", total);
    }
}
