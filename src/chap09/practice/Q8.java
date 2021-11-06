package chap09.practice;
import javax.swing.*;
import java.awt.*;

class NorthPanel extends JPanel{
    public NorthPanel(){
        setLayout(new FlowLayout());
        setBackground(Color.gray);
        add(new JButton("열기"));
        add(new JButton("닫기"));
        add(new JButton("나가기"));
    }
}

class CenterPanel extends JPanel{
    public CenterPanel(){
        setLayout(null);
        for(int i=0;i<10;i++){
            int x = (int)(Math.random()*150) + 50;
            int y = (int)(Math.random()*100) + 50;
            JLabel label = new JLabel("*");
            label.setLocation(x,y);
            label.setSize(10,10);
            add(label);
        }
    }
}

class SouthPanel extends JPanel{
    public SouthPanel(){
        setBackground(Color.yellow);
        setLayout(new FlowLayout(FlowLayout.LEFT));
        add(new JButton("Word input"));
        add(new JTextField(18));
    }
}
public class Q8 extends JFrame {
    public Q8() {
        setTitle("Q8");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300,300);
        Container c = getContentPane();
        c.add(new NorthPanel(),BorderLayout.NORTH);
        c.add(new CenterPanel(),BorderLayout.CENTER);
        c.add(new SouthPanel(),BorderLayout.SOUTH);
        setVisible(true); // 프레임 출력
    }
    public static void main(String[] args) {
        Q8 frame = new Q8();
    }
}
