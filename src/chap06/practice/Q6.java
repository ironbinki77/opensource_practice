package chap06.practice;
import java.util.Calendar;
import java.util.Scanner;

class CloseGame{
    String name;
    int now, after;

    public CloseGame(String name){
        this.name = name;
    }
    public void getTimeNow(){
        Calendar time = Calendar.getInstance();
        this.now = time.get(Calendar.SECOND);
        System.out.println("\t 현재 초 시간 = " + now);
    }
    public void getTimeAfter(){
        Calendar time = Calendar.getInstance();
        this.after = time.get(Calendar.SECOND);
        System.out.println("\t 현재 초 시간 = " + after);
    }
    public int result(){
        if(after - now < 0)
            return after + 60 - now;
        else
            return after - now;
    }
}

public class Q6 {

    static void startGame(CloseGame a){
        Scanner scanner = new Scanner(System.in);
        System.out.print(a.name + " 시작 <Enter>키>>");
        scanner.nextLine();
        a.getTimeNow();
        System.out.print("10초 예상 후 <Enter>키>>");
        scanner.nextLine();
        a.getTimeAfter();
    }
    public static void main(String[] args) {
        CloseGame p1 = new CloseGame("황기태");
        CloseGame p2 = new CloseGame("이재문");
        System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
        startGame(p1);
        startGame(p2);
        System.out.print(p1.name + "의 결과 " + p1.result() + ", " + p2.name + "의 결과 " + p2.result() + ", ");
        if(Math.abs(10-p1.result())<Math.abs(10-p2.result()))
            System.out.println("승자는 " + p1.name);
        else
            System.out.println("승자는 " + p2.name);
    }
}
