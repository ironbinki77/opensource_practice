package chap04.examples;

public class GarbageEx {
    public static void main(String[] args) {
        String a = new String("Good");
        String b = new String("Bad");
        String c = new String("Normal");
        String d,e;
        a = null; // 가비지 생성됨
        d = c;
        c = null;
    }
}
