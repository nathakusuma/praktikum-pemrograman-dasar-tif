import java.util.Scanner;

public class Rerata {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // deklarasi & inisialisasi
        int[] arr = new int[10];
        int total = 0;
        
        for (int i = 0; i < 10; i++) {
            // setiap iterasi, minta input ke user
            // lalu masukkan ke dalam array elemen ke-i
            arr[i] = input.nextInt();

            // jumlahkan juga bilangan yang sudah didapat
            total += arr[i];
        }

        // hitung rata-rata
        double rerata = total / 10.0;

        // looping setiap elemen array
        for (int i = 0; i < 10; i++) {
            // tampilkan nilai dalam array yang lebih besar dari rata-rata
            if (arr[i] > rerata) {
                System.out.print(arr[i] + " ");
            }
        }

        System.out.println();
    }
}