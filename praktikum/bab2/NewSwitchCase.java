import java.util.Scanner;

public class NewSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String predikat = scanner.next();
        switch (predikat.toUpperCase()) {
            case "A" -> {
                System.out.println("Excellent!");
            }
            case "B" -> {
                System.out.println("Good job!");
            }
            case "C" -> {
                System.out.println("Well done");
            }
            case "D" -> {
                System.out.println("You passed");
            }
            case "E" -> {
                System.out.println("Better try again");
            }
            default -> {
                System.out.println("Invalid predikat");
            }
        }
    }
}
