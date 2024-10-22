import java.util.Arrays;

public class Extras {
    public static void main(String[] args) {
        // arrays extras
        int[] arr = { 1, 2, 3 };

        // cari ukuran array
        System.out.println("Panjang array: " + arr.length);

        // copy array ke array yang lain
        int[] copy = arr.clone();
        System.out.println("Salinan array: " + Arrays.toString(copy));

        // copy array dengan ukuran tertentu
        int[] newArr = Arrays.copyOf(arr, 5);
        System.out.println("Salinan baru dengan ukuran 5: " + Arrays.toString(newArr));

        // array to string
        System.out.println("Representasi string array: " + Arrays.toString(arr));

        // mengurutkan array
        Arrays.sort(arr);
        System.out.println("Array setelah diurutkan: " + Arrays.toString(arr));

        // string extras
        String str = "Java";

        // cari karakter pada urutan tertentu
        System.out.println("Karakter di index 1: " + str.charAt(1));

        // ambil bagian dari string berdasarkan indeks awal dan akhir
        System.out.println("Substring dari index 1 hingga 3: " + str.substring(1, 3));

        // memecah string menjadi beberapa bagian, dan memasukkan ke array
        String[] words = str.split("a");
        System.out.println("Hasil split string: " + Arrays.toString(words));

        // membandingkan value dua string
        System.out.println("Apakah string sama dengan 'Java'? " + str.equals("Java"));

        // uppercase - lowercase
        System.out.println("String dalam huruf besar: " + str.toUpperCase());
        System.out.println("String dalam huruf besar: " + str.toLowerCase());

        // replace bagian tertentu
        System.out.println("String setelah mengganti 'J' dengan 'K': " + str.replace("J", "K"));

        // perulangan
        System.out.println("Menggunakan loop standar:");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]); // Output: 1 2 3
        }

        // foreach
        System.out.println("Menggunakan enhanced for-loop:");
        for (int num : arr) {
            System.out.println(num);
        }

        // math extras
        // cari nilai maximum dan minimum
        System.out.println("Nilai maksimum antara 5 dan 10: " + Math.max(5, 10)); // Output: 10
        System.out.println("Nilai minimum antara 5 dan 10: " + Math.min(5, 10)); // Output: 5

        // cari nilai absolute (positif)
        System.out.println("Nilai absolut dari -10: " + Math.abs(-10)); // Output: 10

        // cari akar kuadrat
        System.out.println("Akar kuadrat dari 16: " + Math.sqrt(16)); // Output: 4.0

        // get nilai acak antara 0.0 dan 1.0
        System.out.println("Nilai acak: " + Math.random()); // Output: 0.645...
    }
}