// import scanner
import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        // instansiasi objek scanner
        Scanner input = new Scanner(System.in);

        // input string satu baris (batasnya hanya newline)
        String kalimat = input.nextLine();
        System.out.println(kalimat);

        // input string satu kata (batasnya spasi atau newline)
        String kata = input.next();
        System.out.println(kata);

        // input integer
        int angka = input.nextInt();
        System.out.println(angka);

        // input floating point
        double floatingPoint = input.nextDouble();
        System.out.println(floatingPoint);
    }
}
