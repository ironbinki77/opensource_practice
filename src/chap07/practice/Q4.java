package chap07.practice;
import java.util.*;

public class Q4 {
    public static void main(String[] args) {
        Vector<Integer> v = new Vector<>();
        Scanner scanner = new Scanner(System.in);

        while(true){
            int sum = 0;
            System.out.print("강수량 입력 (0 입력시 종료)>>");
            int num = scanner.nextInt();
            if(num == 0)
                break;
            v.add(num);
            for(int i=0; i<v.size(); i++) {
                int n = v.get(i);
                sum += n;
                System.out.print(n + " ");
            }
            System.out.println("\n현재 평균 " + sum/v.size());
        }
    }
}
