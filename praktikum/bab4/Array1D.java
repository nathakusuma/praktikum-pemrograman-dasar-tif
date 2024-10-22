public class Array1D {
    public static void main(String[] args) {
        // deklarasi array
        int[] nilaiAkhir;

        // instansiasi array
        nilaiAkhir = new int[10];

        // deklarasi & instansiasi array
        int[] nilaiPemdas = new int[10];

        // inisialisasi nilai array
        nilaiAkhir[0] = 90;
        nilaiAkhir[1] = 100;
        nilaiAkhir[2] = 98;
        nilaiAkhir[9] = 99;

        // array initializers
        int[] nilaiRerata = { 100, 98, 97, 99, 10 };

        // array length
        System.out.println(nilaiAkhir.length);
        System.out.println(nilaiPemdas.length);
        System.out.println(nilaiRerata.length);

        // operasi pada array
        nilaiAkhir[0] = 90 - 30;
        nilaiAkhir[1] = nilaiAkhir[2] + nilaiAkhir[3];

        for (int i = 0; i < nilaiAkhir.length; i++) {
            nilaiAkhir[i] = (i + 1) * nilaiAkhir[i];
        }

        // print array
        System.out.println(nilaiAkhir[0]);
        System.out.print(nilaiAkhir[1] + "\n");

        // print setiap elemen array
        for (int i = 0; i < nilaiAkhir.length; i++) {
            System.out.print(nilaiAkhir[i] + " ");
       } 
    }
}
