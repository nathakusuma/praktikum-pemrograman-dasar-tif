public class ComparisonTernary {
    public static void main(String[] args) {
        /*
         * tipeData variabel = kondisi ? pernyataanBenar : pernyataanSalah
         */

        int nilai = 70;
        String status = (nilai > 75) ? "Lulus" : "Remedial";
        System.out.println(status); // Remedial

        int angka = 3;
        String kategori = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(kategori); // Ganjil
    }
}
