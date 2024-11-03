package prak_rekursif; public
class Prak_rekursif {
    public static void main(String[] args) {
        int hasil;
        int bilangan = 5;
        hasil = faktorial(bilangan);
        System.out.println("Nilai dari " + bilangan + "! adalah "
                + hasil);
    }
    private static int faktorial(int bil) {
        if (bil==1)
            return 1;
        else
            return (bil * faktorial(bil-1));
    }
}
