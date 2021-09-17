package chap02.examples;
import java.util.Scanner;

public class CoffeePrice {

	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("���� Ŀ�� �帱���? ");
	String order = scanner.next();
	int price=0;
	switch (order) {
		case "����������":
		case "īǪġ��":
		case "ī���":
			price = 3500;
			break;
		case "�Ƹ޸�ī��" :
			price = 2000;
			break;
		default:
			System.out.println("�޴��� �����ϴ�!");
	}
	if(price != 0)
		System.out.print(order + "�� " + price + "���Դϴ�");
	scanner.close();	
	}
}
