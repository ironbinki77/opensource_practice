package chap02.practice;
import java.util.Scanner;

public class Q4 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int middleNum = 0;
		System.out.print("정수 3개 입력>>");
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();

		if(num1 > num2) {
			if(num1 > num3) {
				if(num2 > num3)
					middleNum = num2;
				else
					middleNum = num3;
			}
			else {
				middleNum = num1;
			}
		}
		else if(num1 < num2) {
			if(num2 > num3) {
				if(num1 > num3)
					middleNum = num1;
				else
					middleNum = num3;
			}
			else
				middleNum = num2;
		}

		System.out.println("중간 값은 "+middleNum);
	}

}
