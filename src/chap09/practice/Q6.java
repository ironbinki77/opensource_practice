package chap09.practice;
import javax.swing.*;
import java.awt.*;

public class Q6 extends JFrame {
    public Q6() {
        setTitle("Q6");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);

        Container c = getContentPane();
        c.setLayout(null);
        for(int i=0;i<20;i++){
            int x = (int)(Math.random()*200) + 50;
            int y = (int)(Math.random()*200) + 50;
            JLabel label = new JLabel();
            label.setLocation(x,y);
            label.setSize(10,10);
            label.setBackground(Color.blue);
            label.setOpaque(true);
            c.add(label);
        }
        setVisible(true); // 프레임 출력
    }
    public static void main(String[] args) {
        Q6 frame = new Q6();
    }
}
