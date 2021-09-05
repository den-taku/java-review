import java.util.*;

public class Main08 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var n = sc.nextInt();
            var set = new HashSet<Integer>();
            for(int i = 0; i < n; ++i) {
                set.add(sc.nextInt());
            }
            System.out.println(set.size());
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
