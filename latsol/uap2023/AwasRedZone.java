import java.util.Scanner;

public class AwasRedZone {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int xa = scanner.nextInt();
        int ya = scanner.nextInt();
        int xb = scanner.nextInt();
        int yb = scanner.nextInt();
        int x = scanner.nextInt();
        int y = scanner.nextInt();

        int xDiff = Math.abs(xa-xb);
        int yDiff = Math.abs(ya-yb);

        if (x <= xb && x >= xa && y <= yb && y >= ya) {
            System.out.println("Bahaya");
        } else if (x <= xa && x >= xb && y <= ya && y >= yb) {
            System.out.println("Bahaya");
        } else if (Math.abs(x - xb) <= xDiff && Math.abs(y - yb) <= yDiff) {
            System.out.println("Hati-hati");
        } else if (Math.abs(x - xa) <= xDiff && Math.abs(y - ya) <= yDiff) {
            System.out.println("Hati-hati");
        } else {
            System.out.println("Aman");
        }
    }
}
