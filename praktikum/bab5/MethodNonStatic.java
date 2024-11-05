public class MethodNonStatic {
    void makan(String makanan){
        System.out.println("Hi!");
        System.out.println("Saya sedang makan " + makanan);
    }
    public static void main(String[] args) {
        // mambuat instansiasi objek saya dari class FungsiStatic
        MethodNonStatic saya = new MethodNonStatic();
        // pemanggilan fungsi non-static
        saya.makan("Mie Pangsit FILKOM");
    }
}
