package chap03.practice;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] str = {"가위","바위","보"};

        while(true){
            System.out.print("가위 바위 보!>>");
            String player = scanner.next();

            if(player.equals("그만")) {
                System.out.print("프로그램을 종료합니다...");
                break;
            }

            int random = (int)(Math.random()*3);
            System.out.print("사용자 = " + player + " , 컴퓨터 = " + str[random]);

            if((player.equals("가위")&&str[random].equals("보"))||(player.equals("바위")&&str[random].equals("가위"))||(player.equals("보")&&str[random].equals("바위")))
                System.out.println(" 사용자가 이겼습니다.");
            else if((player.equals("가위")&&str[random].equals("가위"))||(player.equals("바위")&&str[random].equals("바위"))||(player.equals("보")&&str[random].equals("보")))
                System.out.println(" 비겼습니다.");
            else if((player.equals("가위")&&str[random].equals("바위"))||(player.equals("바위")&&str[random].equals("보"))||(player.equals("보")&&str[random].equals("가위")))
                System.out.println(" 컴퓨터가 이겼습니다.");
            else
                System.out.println();
        }
    }
}
