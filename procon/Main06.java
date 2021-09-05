import java.util.*;

public class Main06 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var n = sc.nextInt();
            var a = sc.nextInt();
            var b = sc.nextInt();
            var ans = 0;
            for(int i = 1; i <= n; ++i) {
                var s = SumDigit.sumDigit(i);
                if (a <= s && s <= b) {
                    ans += i;
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class SumDigit {
    static int sumDigit(int num) {
        var rtn = 0;
        while (num > 0) {
            rtn += num % 10;
            num /= 10;
        }
        return rtn;
    }
}