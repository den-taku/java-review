import java.util.*;

public class Main03 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var s = sc.next();
            var ans = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i)  == '1') {
                    ans++;
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}