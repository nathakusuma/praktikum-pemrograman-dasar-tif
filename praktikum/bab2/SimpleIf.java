public class SimpleIf {
    public static void main(String[] args) {
        int nilai = 85;

        /*
         * Simple If (tanpa tanda kurung kurawal). Hanya bisa dipakai untuk satu
         * statement saja.
         */
        
        if (nilai > 80)
            System.out.println("Lulus di atas rata-rata");
        else if (nilai > 75)
            System.out.println("Lulus");
        else
            System.out.println("Tidak Lulus");
    }
}
