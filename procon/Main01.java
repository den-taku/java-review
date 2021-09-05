import java.util.*;

public class Main01 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var a = sc.nextInt();
            var b = sc.nextInt();
            var c = sc.nextInt();
            var s = sc.next();
            System.out.println(a + b + c + " " + s);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}