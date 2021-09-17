package chap03.practice;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("소문자 알파벳 하나를 입력하시오>>");
        String get = scanner.next();
        char alp = get.charAt(0);
        int interval = alp-'a'+1;

        for (;interval>0;interval--){
            for(int i=0;i<interval;i++){
                System.out.print((char)('a'+i));
            }
            System.out.println();
        }
        scanner.close();
    }
}
