public class BangunRuang {

    public static void main(String[] args) {
        int s = 12;
        int luas = luasKubus(s);

        System.out.println(luas);
    }

    // membuat Method luasPersegi()
    static int luasPersegi(int sisi){
        return sisi * sisi;
    }

    // membuat Method luasKubus()
    static int luasKubus(int sisi){

        // memanggil Method luasPersegi
        return 6 * luasPersegi(sisi);
    }

}
