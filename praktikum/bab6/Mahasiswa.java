public class Mahasiswa {
    String nama;
    int umur;

    public Mahasiswa() {
        this.nama = "Unknown";
        this.umur = 18;
    }

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
    }

    public static void main(String[] args) {
        Mahasiswa mhs1 = new Mahasiswa();
        Mahasiswa mhs2 = new Mahasiswa("Budi", 20);

        mhs1.tampilkanData();
        mhs2.tampilkanData();
    }
}
