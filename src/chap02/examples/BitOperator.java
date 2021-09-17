package chap02.examples;
public class BitOperator {

	public static void main(String[] args) {
		short a = (short)0x55ff;
		short b = (short)0x00ff;
		
		//��Ʈ �� ����
		System.out.println("[��Ʈ ���� ���]");
		System.out.printf("%04x\n", (short)(a & b)); // ��Ʈ AND
		System.out.printf("%04x\n", (short)(a | b)); // ��Ʈ OR
		System.out.printf("%04x\n", (short)(a ^ b)); // ��Ʈ XOR
		System.out.printf("%04x\n", (short)(~a)); // ��Ʈ NOT
		
		byte c = 20; //0x14
		byte d = -8; //0xf8
		
		//��Ʈ ����Ʈ ����
		System.out.println("[����Ʈ ���� ���]");
		System.out.println(c << 2); // c�� 2��Ʈ ���� ����Ʈ
		System.out.println(c >> 2); // c�� 2��Ʈ ������ ����Ʈ 0 ����
		System.out.println(d >> 2); // d�� 2��Ʈ ������ ����Ʈ 1 ����
		System.out.printf("%x\n", (d >>> 2)); // d�� 2��Ʈ ������ ����Ʈ 0 ����
		
	}
}
