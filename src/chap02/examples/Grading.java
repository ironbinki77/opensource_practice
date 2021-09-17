package chap02.examples;
import java.util.Scanner;

public class Grading {

	public static void main(String[] args) {
		char grade;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("������ �Է��ϼ���(0~100): ");
		int score = scanner.nextInt(); // ���� �б�
		if(score >= 90) // score�� 90 �̻�
			grade = 'A';
		else if(score >= 80) // score�� 80 �̻� 90 �̸�
			grade = 'B';
		else if(score >= 70) // score�� 70 �̻� 80 �̸�
			grade = 'C';
		else if(score >= 60) // score�� 60 �̻� 70 �̸�
			grade = 'D';
		else                 // score�� 60 �̸�
			grade = 'F';
		System.out.println("������ " + grade + "�Դϴ�.");
		
		scanner.close();
	}
}
