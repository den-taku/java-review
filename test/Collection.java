import java.util.*;

class Collection {
    public static void main(String[] args) {
        var list = new ArrayList<String>();
        list.add("AAA");
        list.add(new String("BBB"));
        list.add("CCCA");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        var lnlist = new LinkedList<String>();
        lnlist.add("AAA");
        lnlist.add(new String("BBB"));
        lnlist.add(new String("CCCA"));
        for (int i = 0; i < lnlist.size(); i++) {
            System.out.println(lnlist.get(i));
        }

        var set = new HashSet<String>();
        set.add("AAA");
        set.add("BBB");
        set.add("AAA");
        set.add("CCC");
        var it = set.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        var treeset = new TreeSet<String>();
        treeset.add("AAA");
        treeset.add("BBB");
        treeset.add("AAA");
        treeset.add("CCC");
        treeset.add("AAABC");
        var treeit = treeset.iterator();
        while (treeit.hasNext()) {
            System.out.println(treeit.next());
        }

        var map = new HashMap<String, Object>();
        map.put("Name", 26);
        map.put("Age", 26);
        map.put("Name", "Tanaka");
        System.out.println("Name: " + map.get("Name"));
        System.out.println("Age: " + map.get("Age"));
        var mapit = map.keySet().iterator();
        while (mapit.hasNext()) {
            var o = mapit.next();
            System.out.println(o + " = " + map.get(o));
        }

        var treemap = new TreeMap<String, Object>();
        treemap.put("Name", 26);
        treemap.put("Age", 26);
        treemap.put("Name", "Tanaka");
        var treemapit = treemap.keySet().iterator();
        while (treemapit.hasNext()) {
            var o = treemapit.next();
            System.out.println(o + " = " + treemap.get(o));
        }
    }
}