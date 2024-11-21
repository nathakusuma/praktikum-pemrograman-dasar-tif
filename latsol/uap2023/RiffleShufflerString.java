import java.util.Scanner;

public class RiffleShufflerString {

    static String merge(String l, String r) {
        String result = "";
        int maxLen = Math.max(l.length(), r.length());
        for(int i = 0; i < maxLen; i++) {
            if(i < l.length()) result += l.charAt(i);
            if(i < r.length()) result += r.charAt(i);
        }
        return result;
    }

    static String shuffle(String s) {
        if(s.length() == 1) return s;
        int mid = (s.length() + 1) / 2;
        String l = s.substring(0, mid);
        String r = s.substring(mid);
        return merge(shuffle(l), shuffle(r));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        System.out.println(shuffle(s));
    }

}