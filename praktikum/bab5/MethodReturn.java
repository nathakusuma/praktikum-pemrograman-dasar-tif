public class MethodReturn {
    // Method dengan Return value
    static int luasPersegi(int sisi){
        int luas = sisi * sisi;
        return luas;
    }
    public static void main(String[] args) {
        // Panggil method dengan value
        System.out.println("Luas Persegi dengan panjang sisi 10 adalah " + luasPersegi(10));
    }
}
