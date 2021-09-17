package chap02.practice;
import java.util.Scanner;

public class Q8 {

	public static boolean inRect(int x, int y, int rectx1, int recty1, int rectx2, int recty2) {
		if((x >= rectx1 && x <= rectx2) && (y >= recty1 && y <= recty2))
			return true;
		else
			return false;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("직사각형을 이루는 두 개의 좌표를 입력하시오>>");
		int x1 = scanner.nextInt();
		int y1 = scanner.nextInt();
		int x2 = scanner.nextInt();
		int y2 = scanner.nextInt();

		if(inRect(x1,y1,100,100,200,200)||inRect(x2,y2,100,100,200,200)) {
			System.out.println("두 직사각형은 충돌합니다!");
		}
		else
			System.out.println("두 직사각형은 충돌하지 않습니다!");
	}

}
