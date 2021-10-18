package chap06.practice;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("문자열을 입력하세요. 빈칸이 있어도 되고 영어 한글 모두 됩니다.");
        String s = scanner.nextLine();
        char tem;
        for(int i=0;i<s.length();i++){
            tem = s.charAt(0);
            s = s.substring(1);
            s = s+tem;
            System.out.println(s);
        }
    }
}
