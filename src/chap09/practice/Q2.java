package chap09.practice;
import javax.swing.*;
import java.awt.*;

public class Q2 extends JFrame {
    public Q2() {
        setTitle("Q2");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400,200);

        Container c = getContentPane();
        c.setLayout(new BorderLayout(5,7));
        c.add(new JButton("CENTER"), BorderLayout.CENTER);
        c.add(new JButton("NORTH"), BorderLayout.NORTH);
        c.add(new JButton("SOUTH"), BorderLayout.SOUTH);
        c.add(new JButton("EAST"), BorderLayout.EAST);
        c.add(new JButton("WEST"), BorderLayout.WEST);
        setVisible(true); // 프레임 출력
    }
    public static void main(String[] args) {
        Q2 frame = new Q2();
    }
}
