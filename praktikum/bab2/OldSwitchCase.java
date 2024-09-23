import java.util.Scanner;

public class OldSwitchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String predikat = scanner.next();

        switch (predikat.toUpperCase()) {
            case "A":
                System.out.println("Excellent!");
                break;
            case "B":
                System.out.println("Good job!");
                break;
            case "C":
                System.out.println("Well done");
                break;
            case "D":
                System.out.println("You passed");
                break;
            case "E":
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid predikat");
        }

        /*
         * Apabila tidak ada break pada switch case, maka eksekusi akan langsung
         * dilanjut pada case berikutnya setelah salah satu case terpenuhi.
         */
    }
}
