package chap03.practice;
import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("정수 몇개?");
        int count = scanner.nextInt();

        if(count<100){
            int[] arr = new int[count];
            for (int i=0;i<count;i++){
                arr[i] = (int)(Math.random()*100)+1;
                System.out.print(arr[i] + " ");
                if(i%10==9)
                    System.out.println();
            }
        }
        scanner.close();
    }
}
