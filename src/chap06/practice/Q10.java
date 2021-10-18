package chap06.practice;
import java.util.Scanner;

class Person{
    String name;
    int a,b,c;
    public Person(String name){
        this.name = name;
    }
    public boolean Random(){
        this.a = (int)(Math.random()*3 + 1);
        this.b = (int)(Math.random()*3 + 1);
        this.c = (int)(Math.random()*3 + 1);

        System.out.print("\t" + a + "\t" + b + "\t" + c);
        if(a == b && b == c) {
            System.out.print("\t" + name + "님이 이겼습니다!");
            return true;
        }
        else{
            System.out.println("\t 아쉽군요!");
            return false;
        }
    }
}
public class Q10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("1번째 선수 이름>>");
        Person p1 = new Person(scanner.nextLine());
        System.out.print("2번째 선수 이름>>");
        Person p2 = new Person(scanner.nextLine());
        while(true) {
            System.out.print("[" + p1.name + "]:<Enter>");
            scanner.nextLine();
            if(p1.Random())
                break;
            System.out.print("[" + p2.name + "]:<Enter>");
            scanner.nextLine();
            if(p2.Random())
                break;
        }
        scanner.close();
    }
}
