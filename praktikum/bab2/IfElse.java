public class IfElse {
   public static void main(String[] args) {
      int nilai = 80;
      String status;

      if (nilai < 75) {
         status = "Remedial";
      } else {
         status = "Lulus";
      }

      System.out.println(status); // Lulus
   }
}
