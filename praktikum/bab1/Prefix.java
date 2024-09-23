public class Prefix {
    public static void main(String[] args) {
        // prefix
        int a = 10;
        int x = ++a; // a = 11, x = 11
        System.out.println(a + " " + x);

        // ekuivalen dengan:
        int b = 10;
        b++;
        int y = b; // b = 11, y = 11
        System.out.println(b + " " + y);
    }
}
