package chap02.examples;
import java.util.Scanner;

public class ScannerEx {

	public static void main(String[] args) {
		System.out.println("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���");
		Scanner scanner = new Scanner(System.in);
		
		String name = scanner.next(); //���ڿ� �б�
		System.out.print("�̸��� " + name + ", ");
		
		String city = scanner.next(); //���ڿ� �б�
		System.out.print("���ô� " + city + ", ");
		
		int age = scanner.nextInt(); // ���� �б�
		System.out.print("���̴� " + age + "��, ");
		
		double weight = scanner.nextDouble(); //�Ǽ� �б�
		System.out.print("ü���� " + weight + "kg, ");
		
		boolean single = scanner.nextBoolean(); //���� �б�
		System.out.println("���� ���δ� " + single + "�Դϴ�.");
		
		scanner.close(); //scanner �ݱ�
	}
}
