public class ColumnNotEqual2D {
    public static void main(String[] args) {
        // membuat array dengan baris sebanyak 2
        int[][] nilaiPemdas = new int[2][];

        // membuat kolom secara manual untuk setiap barisnya
        nilaiPemdas[0] = new int[10];
        nilaiPemdas[1] = new int[7];

        // assign nilai random pada setiap elemen array
        for (int i = 0; i < nilaiPemdas.length; i++) {
            for (int j = 0; j < nilaiPemdas[i].length; j++) {
                nilaiPemdas[i][j] = (int) (Math.random() * 10);
            }
        }

        // menampilkan setiap elemen array
        for (int i = 0; i < nilaiPemdas.length; i++) {
            for (int j = 0; j < nilaiPemdas[i].length; j++) {
                System.out.print(nilaiPemdas[i][j] + " ");
            }

            System.out.println();
        }
    }
}
