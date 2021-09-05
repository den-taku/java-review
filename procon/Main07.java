import java.util.*;

public class Main07 {
    public static void main(String[] args) {
        try {
            var sc = new Scanner(System.in);
            var n = sc.nextInt();
            var list = new ArrayList<Integer>();
            for(int i = 0; i < n; ++i) {
                list.add(sc.nextInt());
            }
            Collections.sort(list, new Comparator<Integer>() {
                @Override
                public int compare(Integer n1, Integer n2) {
                    return n2 - n1;
                }
            });
            var Alice = 0;
            var Bob = 0;
            for(int i = 0; i < n; ++i) {
                if (i % 2 == 0) {
                    Alice += list.get(i);
                } else {
                    Bob += list.get(i);
                }
            }
            System.out.println(Alice - Bob);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
