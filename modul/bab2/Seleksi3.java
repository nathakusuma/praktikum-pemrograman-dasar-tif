import java.util.Scanner;

public class Seleksi3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int uang;
        System.out.println("Tipe Mata uang yang tersedia");
        System.out.println("1. Dolar - USA (kurs USD 1 = Rp 8000,-)");
        System.out.println("2. Yen - Jepang (kurs JPY 1 = Rp 4000,-)");
        System.out.println("3. Poundsterling - Inggris (kurs 1 Poundsterling = Rp. 10.500, -)");
        System.out.println("4. Euro - MEE (kurs EUR 1 = Rp. 8000,- )");
        System.out.println("5. Riyal - Arab Saudi (kurs 1 Riyal = Rp. 1100,-)");
        System.out.print("Masukkan jenis mata uang anda: ");
        int pilihan = in.nextInt();
        switch (pilihan) {
            case 1:
                System.out.println("Data diterima, jenis valuta Anda: Dolar Amerika Serikat");
                System.out.print("Masukkan banyak uang anda(dalam dolar): ");
                uang = in.nextInt();
                System.out.println("Uang yang diterima: Rp " + (uang*8000) + ",-");
                break;
            case 2:
                System.out.println("Data diterima, jenis valuta Anda: Yen Jepang");
                System.out.print("Masukkan banyak uang anda(dalam Yen): ");
                uang = in.nextInt();
                System.out.println("Uang yang diterima: Rp " + (uang*4000) + ",-");
                break;
            case 3:
                System.out.println("Data diterima, jenis valuta Anda: Poundsterling Inggris");
                System.out.print("Masukkan banyak uang anda(dalam dolar): ");
                uang = in.nextInt();
                System.out.println("Uang yang diterima: Rp " + (uang*10500) + ",-");
                break;
            case 4:
                System.out.println("Data diterima, jenis valuta Anda: Euro MEE");
                System.out.print("Masukkan banyak uang anda(dalam Euro): ");
                uang = in.nextInt();
                System.out.println("Uang yang diterima: Rp " + (uang*8000) + ",-");
                break;
            case 5:
                System.out.println("Data diterima, jenis valuta Anda: Riyal Arab Saudi");
                System.out.print("Masukkan banyak uang anda(dalam Riyal): ");
                uang = in.nextInt();
                System.out.println("Uang yang diterima: Rp " + (uang*1100) + ",-");
                break;
            default:
                System.out.println("data tak ditemukan");
        }
    }
}
