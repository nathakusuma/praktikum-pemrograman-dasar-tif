import java.util.Scanner;

public class Seleksi1 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan nilai: ");
        int nilai = in.nextInt();
        if (nilai > 60)
            System.out.println("Anda lulus");
        else if (nilai >= 40)
            System.out.println("Anda harus mengulang !");
        else{
            System.out.println("Anda gagal");
        }
    }
}
