public class MethodGlobalLokal {
    // ini variabel global
    static String nama = "Praktikum OOP";
    static String version = "1.2.0";

    static void help(){

        // ini variabel lokal
        String nama = "Praktikum Pemdas";

        // mengakses variabel global di dalam fungsi help()
        System.out.println("Nama: " + nama);
        System.out.println("Versi: " + version);
    }

    public static void main(String args[]){

        // panggil fungsi help()
        help();

        System.out.println("Nama 2: " + nama);
        System.out.println("Versi: " + version);
    }
}
