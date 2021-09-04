class Strings {
    public static void main(String[] args) {
        String str = "abc";
        System.out.println(str.length());

        String abc = "ABC";
        if (abc.equals("ABC")) {
            System.out.println("abc is equals to ABC.");
        }
        if (abc.equalsIgnoreCase("abc")) {
            System.out.println("abc is equals to abc.");
        }

        String def = "DEF";
        System.out.println(abc.compareTo(def));

        System.out.println(abc.charAt(abc.length() - 1));

        String lng = "ABCEEFGHIJKLMNOPQRSTUVWXYZ";
        String lnglng = lng + lng;

        System.out.println(lng.indexOf('V'));
        System.out.println(lng.indexOf('a'));
        System.out.println(lnglng.indexOf('A', 1));

        String[] strs = "2003/05/19".split("/");
        for(int i = 0; i < strs.length; ++i) {
            System.out.println(strs[i]);
        }

        for (int i = 0; i < 0; ++i) {
            System.out.println(i);
        }
    }
}