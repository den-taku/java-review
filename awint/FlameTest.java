import java.awt.*;

public class FlameTest extends Frame {
    public static void main(String[] args) {
        var flame = new FlameTest();
    }

    FlameTest() {
        super("FrameTest");

        setSize(200, 100);

        setLayout(new FlowLayout());

        var b1 = new Button("OK");
        add(b1);

        setVisible(true);
    }
}