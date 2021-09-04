import java.awt.*;

class ChoiceTest extends Frame {
    public static void main(String[] args) {
        new ChoiceTest();
    }

    ChoiceTest() {
        super("ChoiceTest");
        setSize(200, 100);
        setLayout(new FlowLayout());
        var c1 = new Choice();
        c1.add("ChoiceA");
        c1.add("ChoiceB");
        c1.add("ChoiceC");
        add(c1);
        setVisible(true);
    }
}