public class Main {
    public static void main(String[] args) {
        Mobil mobil1 = new Mobil("Merah", "Toyota", 0);
        Mobil mobil2 = new Mobil("Biru", "Mitsubishi", 0);

        mobil1.akselerasi(60);
        mobil2.akselerasi(20);

        mobil1.pengereman(100);
        mobil2.pengereman(50);
    }
}
