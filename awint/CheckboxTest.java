import java.awt.*;

class CheckboxTest extends Frame {
    public static void main(String[] args) {
        new CheckboxTest();
    }

    CheckboxTest() {
        super("CheckboxTest");
        setSize(200, 100);
        setLayout(new FlowLayout());
        var c1 = new Checkbox("OK?");
        add(c1);
        setVisible(true);
    }
}