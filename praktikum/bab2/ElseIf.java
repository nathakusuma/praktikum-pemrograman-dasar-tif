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

        System.out.println(kategori); // B+
    }
}
