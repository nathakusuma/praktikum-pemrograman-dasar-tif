public class CopyValueArray {
    public static void main(String[] args) {
        int[] nilaiAkhir = { 90, 98, 97, 99, 10 };

        // copy array reference
        int[] arrCopyRef = nilaiAkhir;
        arrCopyRef[0] = 100;
        // array nilai akhir ikut terpengaruh
        System.out.println(nilaiAkhir[0]);

        // copy value array
        int[] arrCopy = new int[nilaiAkhir.length];
        for (int i = 0; i < arrCopy.length; i++) {
            arrCopy[i] = nilaiAkhir[i];
        }

        // print setiap elemen array
        for (int i = 0; i < arrCopy.length; i++) {
            System.out.print(arrCopy[i] + " ");
        }
        System.out.println();
    }
}
