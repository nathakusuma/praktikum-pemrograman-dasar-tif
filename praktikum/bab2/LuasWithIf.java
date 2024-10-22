import java.util.Scanner;

public class LuasWithIf {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang = input.nextInt();
        int lebar = input.nextInt();

        if (panjang < 0 || lebar < 0) {
            System.out.println("Panjang dan lebar tidak boleh negatif");
        } else {
            int luas = panjang * lebar;
            System.out.println(luas);
        }
    }
}
