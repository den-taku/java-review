import java.util.*;

public class Main09 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var n = sc.nextInt();
            var y = sc.nextInt();
            var c10000 = -1;
            var c5000 = -1;
            var c1000 = -1;
            out: for(int i = 0; i <= n; ++i) {
                for(int j = 0; j <= n - i; ++j) {
                    int k = n - i - j;
                    if (i * 10000 + j * 5000 + k * 1000 == y) {
                        c10000 = i;
                        c5000 = j;
                        c1000 = k;
                        break out;
                    }
                }
            }
            System.out.println(c10000 + " " + c5000 + " " + c1000);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
