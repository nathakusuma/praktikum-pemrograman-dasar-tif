public class ComparisonLogical {
    public static void main(String[] args) {
        int a = 5;

        // apakah 1 < a < 10?
        System.out.println(1 < a && a < 10); // true && true => true

        // apakah 6 < a < 10?
        System.out.println(6 < a && a < 10); // false && true => false
    }
}
