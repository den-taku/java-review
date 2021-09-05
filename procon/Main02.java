import java.util.*;

public class Main02 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var a = sc.nextInt();
            var b = sc.nextInt();
            if (a * b % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("Odd");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}