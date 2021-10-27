package chap07.practice;
import java.util.*;

abstract class Shape{
    private Shape next;
    public abstract void draw(); // 추상 메소드
}
class Line extends Shape {
    @Override
    public void draw() {
        System.out.println("Line");
    }
}
class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("Rect");
    }
}
class Circle extends Shape {
    @Override
    public void draw() {
        System.out.println("Circle");
    }
}
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Shape> v = new Vector<>();
        int num;
        System.out.println("그래픽 에디터 beauty을 실행합니다.");
        while(true){
            System.out.print("삽입(1), 삭제(2), 모두 보기(3), 종료(4)>>");
            num = scanner.nextInt();
            if(num == 1) {
                System.out.print("Line(1), Rect(2), Circle(3)>>");
                num = scanner.nextInt();
                switch (num){
                    case 1:
                        Line line = new Line();
                        v.add(line);
                        break;
                    case 2:
                        Rect rect = new Rect();
                        v.add(rect);
                        break;
                    case 3:
                        Circle circle = new Circle();
                        v.add(circle);
                        break;
                }
            }
            else if(num == 2){
                System.out.print("삭제할 도형의 위치>>");
                num = scanner.nextInt();
                if(num>v.size())
                    System.out.println("삭제할 수 없습니다.");
                else
                    v.remove(num-1);
            }
            else if(num == 3)
                for(int i=0;i<v.size();i++){
                    Shape s = v.get(i);
                    s.draw();
                }
            else if(num == 4) {
                System.out.print("beauty을 종료합니다.");
                break;
            }
        }
    }
}
