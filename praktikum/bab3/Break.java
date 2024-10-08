import java.util.Scanner;

public class Break {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // while loop
        while (true) {
            System.out.print("> ");
            String input = scanner.nextLine();
            
            // keluar dari loop jika user mengetik 'stop'
            if (input.equals("stop")) {
                break;
            }
            
            // print apa yang user ketik
            System.out.println(input);
        }
        
        // print pesan setelah keluar loop
        System.out.println("Program berhenti.");
    }
}
