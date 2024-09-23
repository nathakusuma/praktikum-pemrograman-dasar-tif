public class SwitchCaseIfElse {
    public static void main(String[] args) {
        int number = 10;

        /*
         * If Else
         */

        if (number == 10) {
            System.out.println("Sepuluh");
        } else if (number == 20) {
            System.out.println("Dua puluh");
        } else {
            System.out.println("Lainnya");
        }

        /*
         * Switch Case
         */

        switch (number) {
            case 10:
                System.out.println("Sepuluh");
                break;
            case 20:
                System.out.println("Dua puluh");
            default:
                System.out.println("Lainnya");
                break;
        }
    }
}