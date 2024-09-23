public class Logical {
    public static void main(String[] args) {
        // operator AND (&&)
        System.out.println(false && false); // false
        System.out.println(true && false); // false
        System.out.println(false && true); // false
        System.out.println(true && true); // true

        // operator OR (||)
        System.out.println(false || false); // false
        System.out.println(true || false); // true
        System.out.println(false || true); // true
        System.out.println(true || true); // true

        // operator NOT (!)
        System.out.println(!true); // false
        System.out.println(!false); // true

        // operator XOR (^)
        System.out.println(false ^ false); // false
        System.out.println(true ^ false); // true
        System.out.println(false ^ true); // true
        System.out.println(true ^ true); // false
    }
}
