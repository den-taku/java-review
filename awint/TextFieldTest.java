import java.awt.*;

class TextFieldTest extends Frame {
    public static void main(String[] args) {
        new TextFieldTest();
    }

    TextFieldTest() {
        super("TextFieldtest");
        setSize(200, 100);
        setLayout(new FlowLayout());
        var t1 = new TextField("Hello, World!");
        add(t1);
        setVisible(true);
    }
}