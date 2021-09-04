import java.awt.*;

class CanvasTest extends Frame {
    public static void main(String[] args) {
        new CanvasTest();
    }

    CanvasTest() {
        super("CanvasTest");
        setSize(200, 100);
        setLayout(new BorderLayout());
        var mc1 = new MyCanvas();
        add(mc1, BorderLayout.CENTER);
        setVisible(true);
    }
}

class MyCanvas extends Canvas {
    public void paint(Graphics g) {
        g.drawLine(10, 10, 120, 40);
    }
}