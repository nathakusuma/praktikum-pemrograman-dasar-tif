public class Mobil {
    String warna;
    String merek;
    int kecepatan;

    public Mobil(String warna, String merek, int kecepatan) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatan = kecepatan;
    }

    public void akselerasi(int tambahKecepatan) {
        kecepatan += tambahKecepatan;
        System.out.println("Mobil " + merek + " sekarang bergerak dengan kecepatan " + kecepatan + " km/h");
    }    

    public void pengereman(int penguranganKecepatan) {
        kecepatan -= penguranganKecepatan;
        System.out.println("Mobil " + merek + " sekarang bergerak dengan kecepatan " + kecepatan + " km/h");
    }
}