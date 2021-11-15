package chap10.practice;
import chap10.examples.FlyingTextEx;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Q4 extends JFrame{
    private String a = "Love Java";
    private JLabel la = new JLabel(a);
    public Q4(){
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        la.setSize(100,20);
        c.add(la);
        c.addKeyListener(new MyKeyListener());

        setSize(300,100);
        setVisible(true);
        c.setFocusable(true);
        c.requestFocus();
    }
    class MyKeyListener extends KeyAdapter{
        @Override
        public void keyPressed(KeyEvent e) {
            String c;
            if(e.getKeyCode() == KeyEvent.VK_LEFT){
                c = a.substring(0,1);
                a = a.substring(1);
                a += c;
                la.setText(a);
                System.out.println(a);
            }
        }
    }

    public static void main(String[] args) {
        new Q4();
    }
}
