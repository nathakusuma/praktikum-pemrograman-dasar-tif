public class Postfix {
    public static void main(String[] args) {
        // postfix
        int a = 10;
        int x = a++; // a = 11, x = 10
        System.out.println(a + "  " + x);

        // ekuivalen dengan:
        int b = 10;
        int y = b;
        b++; // b = 11, y = 10
        System.out.println(b + "  " + y);
    }
}
