import java.util.Scanner;

public class Looping {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt(); // 5

        System.out.println("Mulai berhitung");

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                return;
            }
            System.out.println(i);
        }

        System.out.println("Selesai berhitung");
    }
}
