import java.util.*;

public class Main04 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var n = sc.nextInt();
            var list = new ArrayList<Integer>();
            for (int i = 0; i < n; i++) {
                list.add(sc.nextInt());
            }
            var ans = 0;
            out: do {
                for(int i = 0; i < n; i++) {
                    if (list.get(i) % 2 == 0) {
                        list.set(i, list.get(i) / 2);
                    } else {
                        break out;
                    }
                }
                ans++;
            } while (true);
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}