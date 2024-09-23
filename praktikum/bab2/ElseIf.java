public class ElseIf {
    public static void main(String[] args) {
        int nilai = 80;
        String kategori;

        if (nilai > 80) {
            kategori = "A";
        } else if (nilai > 75) {
            kategori = "B+";
        } else if (nilai > 70) {
            kategori = "B";
        } else if (nilai > 65) {
            kategori = "C+";
        } else {
            kategori = "C";
        }

        /*
         * Pengecekan kondisi akan dilakukan secara sekuensial dari atas ke bawah.
         * Apabila kondisi pada if pertama terpenuhi, maka statement akan di eksekusi,
         * lalu program akan langsung keluar dari if statement tanpa mengecek kondisi
         * yang lain. Tapi apabila tidak terpenuhi, maka pengecekan kondisi akan
         * dilakukan pada else if selanjutnya, dan seterusnya. Apabila tidak ada kondisi
         * yang memenuhi, maka else akan dijalankan (jika ada).
         */

        System.out.println(kategori); // B+
    }
}
