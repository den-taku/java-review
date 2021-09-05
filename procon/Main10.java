import java.util.*;

public class Main10 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var s = sc.next();
            var ans = "YES";
            while (s.length() > 0) {
                if (s.endsWith("dream") || s.endsWith("erase")) {
                    s = s.substring(0, s.length() - 5);
                } else if (s.endsWith("dreamer")) {
                    s = s.substring(0, s.length() - 7);
                } else if (s.endsWith("eraser")) {
                    s = s.substring(0, s.length() - 6);
                } else {
                    ans = "NO";
                    break;
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
