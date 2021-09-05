import java.util.*;

public class Main11 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var n = sc.nextInt();
            var t = new ArrayList<Integer>();
            var x = new ArrayList<Integer>();
            var y = new ArrayList<Integer>();
            for(int i = 0; i < n; ++i) {
                var tmp = sc.nextInt();
                t.add(tmp);
                tmp = sc.nextInt();
                x.add(tmp);
                tmp = sc.nextInt();
                y.add(tmp);
            }
            var posx = 0;
            var posy = 0;
            var post = 0;
            var ans = "Yes";
            for (int i = 0; i < n; i++) {
                var disx = Math.abs(x.get(i) - posx);
                var disy = Math.abs(y.get(i) - posy);
                var dis = disx + disy;
                var time = t.get(i) - post;
                if (Math.abs(dis - time) % 2 != 0 || dis > time) {
                    ans = "No";
                    break;
                } else {
                    posx = x.get(i);
                    posy = y.get(i);
                    post = t.get(i);
                }
            }
            System.out.println(ans);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
