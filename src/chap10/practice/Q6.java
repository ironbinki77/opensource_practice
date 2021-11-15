package chap10.practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q6 extends JFrame{
    private JLabel la = new JLabel("C");
    public Q6(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(null);

        la.setLocation(100,100);
        la.setSize(100,20);
        c.add(la);

        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);

        setSize(300,300);
        setVisible(true);
    }
    class MyMouseListener extends MouseAdapter{
        @Override
        public void mouseClicked(MouseEvent e) {
            la.setLocation((int)(Math.random()*300),(int)(Math.random()*300));
        }
    }
    public static void main(String[] args) {
        new Q6();
    }
}
