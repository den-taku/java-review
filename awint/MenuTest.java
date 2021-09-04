import java.awt.*;
import java.awt.event.*;

class MenuTest extends Frame implements ActionListener, ItemListener {
    public static void main(String[] args) {
        new MenuTest();
    }

    MenuTest() {
        setTitle("MenuTest");
        setSize(500, 420);
        setLayout(new FlowLayout());

        var menuBar = new MenuBar();
        setMenuBar(menuBar);

        // [File]
        var menuFile = new Menu("File");
        menuFile.addActionListener(this);
        menuBar.add(menuFile);

        // [File] - [Open]
        var menuOpen = new MenuItem("Open...", new MenuShortcut('O'));
        menuFile.add(menuOpen);

        // [File] - [----]
        menuFile.addSeparator();

        // [File] - [Exit]
        var menuExit = new MenuItem("Exit...");
        menuFile.add(menuExit);

        // [View]
        var menuView = new Menu("View");
        menuView.addActionListener(this);
        menuBar.add(menuView);

        // [View] - [Status Bar]
        var menuStatusBar = new CheckboxMenuItem("Status Bar");
        menuStatusBar.addItemListener(this);
        menuView.add(menuStatusBar);

        // [View] - [Size]
        var menuSize = new Menu("Size");
        menuSize.addActionListener(this);
        menuView.add(menuSize);

        // [View] - [Size] - [Large]
        var menuSizeLarge = new MenuItem("Large");
        menuSize.add(menuSizeLarge);

        // [View] - [Size] - [Small]
        var menuSizeSmall = new MenuItem("Small");
        menuSize.add(menuSizeSmall);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println(e.getActionCommand());
    }

    public void itemStateChanged(ItemEvent e) {
        var menu = (CheckboxMenuItem)e.getSource();
        if (menu.getState()) {
            System.out.println(menu.getLabel() + " SELECTED");
        } else {
            System.out.println(menu.getLabel() + " DESELECTED");
        }
    }
}

class MyMenu extends Menu {
    public void paint(Graphics g) {
        g.drawLine(10, 10, 120, 40);
    }
}