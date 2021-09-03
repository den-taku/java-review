import java.util.*;

class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!!");

        boolean booleana = true;
        System.out.println(booleana);

        char chara = 'A';
        char charb = '\u0041';
        char charc = 'あ';
        System.out.println(chara + " " + charb + " " + charc);

        byte bytea = 127;
        short shortb = 32767;
        int intc1 = 2147483647;
        int intc2 = 0x79ab45;
        long longd = 9223372036854775807L;
        System.out.println(bytea + " " + shortb + " " + intc1 + " " + intc2 + " " + longd);

        float floata = 1.23F;
        float floatb = 1.23e4F;
        double doublec = 1.23e4;
        System.out.println(floata + " " + floatb + " " + doublec);
        System.out.println(Float.NaN + " " + Float.POSITIVE_INFINITY + " " + Float.NEGATIVE_INFINITY);
        System.out.println(Double.NaN + " " + Double.POSITIVE_INFINITY + " " + Double.NEGATIVE_INFINITY);

        System.out.println(add(5, 6));
        test();

        int intd = 3 < 5 * 6 ? 57 : 78;
        System.out.println(intd);

        String string1 = "ABC";
        String string2 = "DEF";

        if (string1.equals(string2)) {
            System.out.println(string1 + " is the same to " + string2 + ".");
        } else {
            System.out.println(string1 + " is not the same to " + string2 + ".");
        }

        int intValue = 123;
        long longValue = intValue;
        System.out.println(longValue);
        short shortValue = (short)intValue;
        System.out.println(shortValue);

        ArrayList<String> list = new ArrayList<String>();
        list.add(new String("AAA"));
        list.add(new String("BBB"));
        list.add(new String("CCC"));
        for (int i = 0; i < list.size(); i++) {
            String s = list.get(i);
            System.out.println(s);
        }

        var num = 123;
        System.out.println(num);
    }

    static int add(int x, int y) {
        return x + y;
    }

    static void test() {
        System.out.println("TEST");
    }

}
