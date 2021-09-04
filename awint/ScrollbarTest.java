import java.awt.*;

class ScrollbarTest extends Frame {
    public static void main(String[] args) {
        new ScrollbarTest();
    }

    ScrollbarTest() {
        super("ScrollbarTest");
        setSize(200, 100);
        setLayout(new BorderLayout());
        var sb1 = new Scrollbar(Scrollbar.HORIZONTAL);
        add(sb1, BorderLayout.SOUTH);
        setVisible(true);
    }
}