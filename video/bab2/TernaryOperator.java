public class TernaryOperator {
    public static void main(String[] args) {
        int nilai = 74;

//        String ucapan;
//        if (nilai >= 75) {
//            ucapan = "Selamat Anda Lulus";
//        } else {
//            ucapan = "Silakan Coba lagi";
//        }

        String ucapan = nilai >= 75 ? "Selamat Anda Lulus" : "Silahkan Coba lagi";

        System.out.println(ucapan);

    }
}