//문제 8번
package chap04.practice;
import java.util.Scanner;

class Phone{
    private String name,p_number;

    public Phone(String name, String p_number){
        this.name = name;
        this.p_number = p_number;
    }
    public boolean compare(String s){
        return s.equals(name);
    }
    public String get(){
        return p_number;
    }
}
public class Q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;

        System.out.print("인원수>>");
        num = scanner.nextInt();

        Phone p [] = new Phone[num];
        for(int i=0; i<p.length;i++){
            System.out.print("이름과 전화번호(이름과 번호는 빈 칸없이 입력)>>");
            String name = scanner.next();
            String p_number = scanner.next();
            p[i] = new Phone(name,p_number);
        }
        System.out.println("저장되었습니다...");

        while(true){
            int flag = 0;
            System.out.print("검색할 이름>>");
            String name = scanner.next();
            if(name.equals("그만"))  //"그만"을 입력하면 프로그램 종료
                break;
            for(int i=0; i<p.length;i++){
                if(p[i].compare(name)){  // 입력한 이름이 존재한 경우
                    System.out.println(name + "의 번호는 " + p[i].get() + " 입니다.");
                    flag++;  // flag값 증가
                    break;
                }
            }
            if(flag == 0)  // flag값이 증가하지 않은 경우(입력한 이름이 존재하지 않은 경우)
                System.out.println(name + " 이 없습니다.");
        }
        scanner.close();
    }
}
