package chap07.practice;
import java.util.*;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> a = new ArrayList<>();
        double sum = 0;

        System.out.print("6개의 학점을 빈 칸으로 분리 입력(A/B/C/D/F)>>");
        for(int i=0; i<6;i++)
            a.add(scanner.next());

        for(int i=0; i<6;i++){
            switch (a.get(i)){
                case "A":
                    sum += 4.0;
                    break;
                case "B":
                    sum += 3.0;
                    break;
                case "C":
                    sum += 2.0;
                    break;
                case "D":
                    sum += 1.0;
                    break;
                case "F":
                    sum += 0;
                    break;
            }
        }

        System.out.println(sum/a.size());
    }
}
