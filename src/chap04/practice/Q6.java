//문제 6번
package chap04.practice;
import java.util.Scanner;

class Circle{
    private double x,y;
    private int radius;
    public Circle(double x, double y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public void show(){
        System.out.println("("+ x + ", " + y + ")" + radius);
    }
    public boolean compare(Circle c){
        return radius*radius >= c.radius*c.radius;
    }
}
public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Circle c[] = new Circle[3];
        for (int i = 0; i < c.length; i++) {
            System.out.print("x, y, radius >>");
            double x = scanner.nextDouble();
            double y = scanner.nextDouble();
            int radius = scanner.nextInt();
            c[i] = new Circle(x, y, radius);
        }
        if (c[0].compare(c[1])) {
            if (c[0].compare(c[2])) {
                System.out.print("가장 면적이 큰 원은 ");
                c[0].show();
            } else {
                System.out.print("가장 면적이 큰 원은 ");
                c[2].show();
            }
        } else {
            if (c[1].compare(c[2])) {
                System.out.print("가장 면적이 큰 원은 ");
                c[1].show();
            } else {
                System.out.print("가장 면적이 큰 원은 ");
                c[2].show();
            }
        }
        scanner.close();
    }
}
