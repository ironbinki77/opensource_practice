package chap02.practice;
import java.util.Scanner;

public class Q12_2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("연산>>");
		int num1 = scanner.nextInt();
		String Op = scanner.next();
		int num2 = scanner.nextInt();
		int result = 0;

		switch (Op) {
			case "+":
				result = num1 + num2;
				break;
			case "-":
				result = num1 - num2;
				break;
			case "*":
				result = num1 * num2;
				break;
			case "/":
				if(num2==0) {
					System.out.println("0으로 나눌 수 없습니다.");
					System.exit(0);
				}
				else
					result = num1 / num2;
				break;
		}
		System.out.println(num1 + Op + num2 + "의 계산 결과는 " + result);
	}

}
