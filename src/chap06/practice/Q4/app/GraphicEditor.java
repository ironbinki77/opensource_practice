package chap06.practice.Q4.app;
import chap06.practice.Q4.base.Shape;
import chap06.practice.Q4.derived.Circle;

public class GraphicEditor {
    public static void main(String[] args) {
        Shape shape = new Circle();
        shape.draw();
    }
}
