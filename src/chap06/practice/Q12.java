package chap06.practice;
import java.util.Scanner;

class Person_Q12{
    String name;
    int a,b,c;
    public Person_Q12(String name){
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

public class Q12 {
    public static void main(String[] args) {
        int flag = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("겜블링 게임에 참여할 선수 숫자>>");
        int num = scanner.nextInt();
        scanner.nextLine();

        Person_Q12 [] people = new Person_Q12[num];
        for(int i=0; i< people.length; i++){
            System.out.print( (i + 1) + "번째 선수 이름>>");
            people[i] = new Person_Q12(scanner.nextLine());
        }

        while(true) {
            for(int i=0; i<num; i++){
                System.out.print("[" + people[i].name + "]:<Enter>");
                scanner.nextLine();
                if(people[i].Random()){
                    flag++;
                    break;
                }
            }
           if(flag == 1)
               break;
        }
        scanner.close();
    }
}
