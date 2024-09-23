public class Comparison {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 3;

        // operator equal (==)
        System.out.println(a == b); // true
        System.out.println(a == c); // false

        // operator not equal (!=)
        System.out.println(a != b); // false
        System.out.println(a != c); // true

        // operator less than dan less than equal (< dan <=)
        System.out.println(a < b); // false
        System.out.println(a <= b); // true

        // operator greater than dan greater than equal (> dan >=)
        System.out.println(c > b); // true
        System.out.println(c >= b); // true
    }
}
