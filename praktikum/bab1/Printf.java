public class Printf {
    public static void main(String[] args) {
        // format => %[flag][lebar][.presisi][tipe]

        // %d => desimal
        // %10d => desimal lebar 10 rata kanan
        // %-10d => desimal lebar 10 rata kiri
        // %+10d => desimal lebar 10 rata kanan dengan tanda +
        // %-+10d => desimal lebar 10 rata kiri dengan tanda +

        // %f => float
        // %10f => float lebar 10 rata kanan
        // %-10f => float lebar 10 rata kiri
        // %-10.2f => float lebar 10 rata kiri 2 titik desimal
        // %+10.2f => float lebar 10 rata kanan 2 titik desimal dengan tanda +
        // %-+10.2f => float lebar 10 rata kiri 2 titik desimal dengan tanda +

        // %s => string
        // %10s => string lebar 10 rata kanan
        // %-10s => string lebar 10 rata kiri
        // %-10.5s => 5 karakter pertama string lebar 10 rata kiri
        System.out.printf("%-20.9s |", "hello world");
    }
}
