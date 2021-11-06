package chap09.practice;
import javax.swing.*;
import java.awt.*;

public class Q4 extends JFrame {
    public Q4() {
        setTitle("Q4");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(500,200);

        Container c = getContentPane();
        c.setLayout(new GridLayout(1,10));
        JButton[] num = new JButton[10];
        for(int i=0;i<10;i++){
            num[i] = new JButton(Integer.toString(i+1));
            c.add(num[i]);
        }
        num[0].setBackground(Color.red);
        num[1].setBackground(Color.orange);
        num[2].setBackground(Color.yellow);
        num[3].setBackground(Color.green);
        num[4].setBackground(Color.blue);
        num[5].setBackground(Color.magenta);
        num[6].setBackground(Color.white);
        num[7].setBackground(Color.black);
        num[8].setBackground(Color.gray);
        num[9].setBackground(Color.cyan);
        setVisible(true); // 프레임 출력
    }
    public static void main(String[] args) {
        Q4 frame = new Q4();
    }
}
