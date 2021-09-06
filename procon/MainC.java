import java.util.*;

// https://atcoder.jp/contests/abc015/submissions/25658826

public class MainC {
    public static void main(String[] args) {
        var w = 0;
        var n = 0;
        var k = 0;
        var a = new int[n];
        var b = new int[n];
        try {
            var scanner = new Scanner(System.in);
            w = scanner.nextInt();
            n = scanner.nextInt();
            k = scanner.nextInt();
            a = new int[n];
            b = new int[n];
            for (int i = 0; i < n; ++i) {
                a[i] = scanner.nextInt();
                b[i] = scanner.nextInt();
            }
            scanner.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        System.out.println(Solver.solve(w, n, k, a, b));
    }
}


class Solver {
    static int solve(int w, int n, int k, int[] a, int[] b) {
        var dp = new int[(n + 1) * (k + 1) * (w + 1)];
        for (int p = 1; p <= w; ++p) {
            for (int q = 1; q <= k; ++q) {
                for (int r = 1; r <= n; ++r) {
                    if (p >= a[r - 1]) {
                        dp[p * (k + 1) * (n + 1) + q * (n + 1) + r] = Math.max(
                                dp[p * (k + 1) * (n + 1) + q * (n + 1) + r - 1],
                                dp[(p - a[r - 1]) * (k + 1) * (n + 1) + (q - 1) * (n + 1) + r - 1]
                                        + b[r - 1]);
                    } else {
                        dp[p * (k + 1) * (n + 1) + q * (n + 1) + r] =
                                dp[p * (k + 1) * (n + 1) + q * (n + 1) + r - 1];
                    }
                }
            }
        }
        return dp[w * (k + 1) * (n + 1) + k * (n + 1) + n];
    }
}
