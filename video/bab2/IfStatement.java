public class IfStatement {
    public static void main(String[] args) {
        int nilai = 80;
        int presensi = 5;

        boolean lulusNilai = nilai >= 75;
        boolean lulusPresensi = presensi >= 75;

        boolean lulus = lulusNilai && lulusPresensi;

        if (lulus) {
            System.out.println("Selamat Anda Lulus");
        } else {
            System.out.println("Silahkan Coba Lagi Tahun Depan");
        }

        System.out.println("Yuk cetak nilainya");


        if (nilai >= 80 && presensi >= 80) {
            System.out.println("Nilai Anda A");
        } else if (nilai >= 70 && presensi >= 70) {
            System.out.println("Nilai Anda B");
        } else if (nilai >= 60 && presensi >= 60) {
            System.out.println("Nilai Anda C");
        } else if (nilai >= 50 && presensi >= 50) {
            System.out.println("Nilai Anda D");
        } else {
            System.out.println("Nilai Anda E");
        }

        System.out.println("Program selesai");

    }
}