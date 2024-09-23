public class IfElse {
   public static void main(String[] args) {
      int nilai = 80;
      String status;

      if (nilai < 75) {
         status = "Remedial";
      } else {
         status = "Lulus";
      }

      /*
       * Pengecekan kondisi akan dilakukan pada if, apabila kondisi terpenuhi, maka
       * statement akan di eksekusi dan program akan keluar dari if statement. Apabila
       * kondisi tidak terpenuhi, maka program akan menjalankan statement yang ada
       * pada else, lalu keluar if statement.
       */

      System.out.println(status); // Lulus
   }
}
