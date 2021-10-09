package chap05.practice;
import java.util.Scanner;

abstract class Shape{
    private Shape next;
    public Shape() { next = null; }
    public void setNext(Shape obj){ next = obj; } //링크 연결
    public Shape getNext(){ return next; }
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
public class Q12 {
    static void insert(Shape root, Shape a){ //삽입 기능 구현한 함수
        if(root.getNext() == null) //처음 삽입 하는 경우
            root.setNext(a);
        else{
            Shape check = root.getNext();
            while(true){
                if(check.getNext()==null) {
                    check.setNext(a);
                    break;
                }
                check = check.getNext();
            }
        }
    }
    static void delete(Shape root, int pos){ //삭제 기능 구현한 함수
        Shape a = root;
        Shape b = root.getNext();
        for(int i = 0; i < pos-1; i++){
            if(b == null)
                break;
            a = a.getNext();
            b = b.getNext();
        }
        if(b==null) //범위를 벗어난 경우
            System.out.println("삭제할 수 없습니다.");
        else
            a.setNext(b.getNext());
    }
    static void printall(Shape root){ //모두 보기 기능 구현한 함수
        Shape check = root;
        while(check.getNext() != null){
            check = check.getNext();
            check.draw();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Shape root = new Line();
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
                        insert(root,line);
                        break;
                    case 2:
                        Rect rect = new Rect();
                        insert(root,rect);
                        break;
                    case 3:
                        Circle circle = new Circle();
                        insert(root,circle);
                        break;
                }
            }
            else if(num == 2){
                System.out.print("삭제할 도형의 위치>>");
                num = scanner.nextInt();
                delete(root,num);
            }
            else if(num == 3)
                printall(root);
            else if(num == 4) {
                System.out.print("beauty을 종료합니다.");
                break;
            }
        }
    }
}
