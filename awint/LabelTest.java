import java.awt.*;

class LabelTest extends Frame {
    public static void main(String[] args) {
        new LabelTest();
    }

    LabelTest() {
        super("LabelTest");
        setSize(200, 100);
        setLayout(new FlowLayout());
        var l1 = new Label("Hello World!");
        add(l1);
        setVisible(true);
    }
}