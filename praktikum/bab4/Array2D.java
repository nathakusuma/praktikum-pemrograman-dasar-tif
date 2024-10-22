public class Array2D {
    public static void main(String[] args) {
        // array 2 baris dan 10 kolom (2d)
        // deklarasi & instansiasi
        int[][] nilaiAkhir = new int[2][10];

        // assingment pada elemen array 2d
        nilaiAkhir[0][0] = 100; 
        nilaiAkhir[0][1] = 90; 
        nilaiAkhir[1][2] = 96; 
        nilaiAkhir[1][4] = 80; 

        // menggunakan looping untuk mengisi array 2d
        for (int i = 0; i < nilaiAkhir.length; i++) {
            for (int j = 0; j < nilaiAkhir[i].length; j++) {
                nilaiAkhir[i][j] = (int) (Math.random() * 10);
            }
        }

        // array initializers 2d
        int[][] nilaiRerata = {
            {90, 80, 70, 60, 20},
            {91, 92, 25, 45, 70, 21},
            {10, 20, 30}
        };

        // print array
        System.out.println(nilaiAkhir[0][0]);
        System.out.print(nilaiAkhir[1][0] + "\n");

        // print memakai looping
        for (int i = 0; i < nilaiAkhir.length; i++) {
            for (int j = 0; j < nilaiAkhir[i].length; j++) {
                System.out.print(nilaiAkhir[i][j] + " ");
            }
            System.out.println();
        } 

        // cari length
        System.out.println(nilaiAkhir.length);
        System.out.println(nilaiAkhir[0].length);
        System.out.println(nilaiAkhir[1].length);
    }
}
