public class MultiForLoop {
    public static void main(String[] args) {
        // for loop dengan dua variable
        // looping selama nilai i < 10 dan nilai j > 0
        for (int i = 0, j = 10; i < 10 && j > 0; i++, j--) {
            // setiap iterasi akan increment nilai i dan decrement nilai j
            System.out.println(i);
            System.out.println(j);
        }
    }
}
