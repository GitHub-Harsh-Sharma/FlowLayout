import java.awt.*;
import javax.swing.*;

class JavaApplication5 {
    Frame f;

    JavaApplication5() {
        f = new Frame("Hello");
        JButton b1 = new JButton("1");
        JButton b2 = new JButton("2");
        JButton b3 = new JButton("3");
        JButton b4 = new JButton("4");
        JButton b5 = new JButton("5");

        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        FlowLayout f1 = new FlowLayout(FlowLayout.RIGHT, 30, 30);
        f.setLayout(f1);
        f.setSize(300, 300);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        JavaApplication5 ja = new JavaApplication5();
    }
}
