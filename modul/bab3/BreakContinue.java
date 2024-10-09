public class BreakContinue {
    public static void main(String[] args) {
        int nilai;
        System.out.println("pernyataan break batas 10");
        for (nilai = 1; nilai <= 10; nilai++) {
            if (nilai == 5)
                break;
            else
                System.out.println(nilai);
        }
        System.out.println();
        System.out.println("pernyataan continue batas 10");
        for (nilai = 1; nilai <= 10; nilai++) {
            if (nilai == 5)
                continue;
            else
                System.out.println(nilai);
        }
    }
}
