import java.awt.*;

class TextAreaTest extends Frame {
    public static void main(String[] args) {
        new TextAreaTest();
    }

    TextAreaTest() {
        super("TextAreatest");
        setSize(200, 100);
        setLayout(new FlowLayout());
        var b1 = new TextArea("Hello, World!", 3, 20);
        add(b1);
        setVisible(true);
    }
}