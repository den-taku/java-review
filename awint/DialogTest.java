import java.awt.*;
import java.awt.event.*;

class DialogTest extends Frame {
    public static void main(String[] args) {
        new DialogTest();
    }

    DialogTest() {
        super("DialogTest");
        setSize(200, 100);
        var dlg = new MyDialog(this);
        dlg.setVisible(true);
        setVisible(true);
    }
}

class MyDialog extends Dialog implements ActionListener {
    MyDialog(Frame owner) {
        super(owner);
        setLayout(new FlowLayout());
        var b1 = new Button("OK");
        b1.addActionListener(this);
        add(b1);
        setTitle("MyDialog");
        setSize(80, 80);
    }
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
    }
}