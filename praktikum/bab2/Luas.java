import java.util.Scanner;

public class Luas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int panjang = input.nextInt();
        int lebar = input.nextInt();

        int luas = panjang * lebar;
        System.out.println(luas);
    }
}
