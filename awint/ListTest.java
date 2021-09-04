import java.awt.*;

class ListTest extends Frame {
    public static void main(String[] args) {
        new ListTest();
    }

    ListTest() {
        super("ListTest");
        setSize(200, 100);
        setLayout(new FlowLayout());
        var c1 = new List();
        c1.add("ListA");
        c1.add("ListB");
        c1.add("ListC");
        add(c1);
        setVisible(true);
    }
}