package chap03.practice;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] unit = {50000,10000, 1000, 100, 10, 1};

        System.out.print("금액을 입력하시오>>");
        int money = scanner.nextInt();

        for (int j : unit) {
            System.out.println(j + "원 짜리 : " + money / j + "개");
            money -= j * (money / j);
        }
        scanner.close();
    }
}
