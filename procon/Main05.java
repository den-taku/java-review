import java.util.*;

public class Main05 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var a = sc.nextInt();
            var b = sc.nextInt();
            var c = sc.nextInt();
            var x = sc.nextInt();
            var ans = 0;
            for (int i = 0; i <= a; ++i) {
                for (int j = 0; j <= b; ++j) {
                    for (int k = 0; k <= c; ++k) {
                        if (500 * i + 100 * j + 50 * k == x) {
                            ans++;
                        }
                    }
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}