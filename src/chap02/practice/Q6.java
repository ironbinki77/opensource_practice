package chap02.practice;
import java.util.Scanner;

public class Q6 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("1~99 사이의 정수를 입력하시오>>");
		int num = scanner.nextInt();
		int check = 0;

		if ((num % 10)%3 == 0)
			check++;
		if((num - (num % 10)) % 3 == 0)
			check++;

		if(check==1)
			System.out.println("박수짝");
		else if(check==2)
			System.out.println("박수짝짝");

	}

}
