package chap10.practice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q2 extends JFrame{
    public Q2(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setBackground(Color.GREEN);

        MyMouseListener listener = new MyMouseListener();
        c.addMouseListener(listener);
        c.addMouseMotionListener(listener);

        setSize(300,200);
        setVisible(true);
    }
    class MyMouseListener extends MouseAdapter{
        @Override
        public void mouseDragged(MouseEvent e) {
            Component c = e.getComponent();
            c.setBackground(Color.YELLOW);
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            Component c = e.getComponent();
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Q2();
    }
}
