package chap07.practice;
import java.util.*;

public class Q8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        HashMap<String,Integer> h = new HashMap<>();
        System.out.println("** 포인트 관리 프로그램입니다. **");
        while(true){
            System.out.print("이름과 포인트 입력>> ");
            String name = scanner.next();
            if(name.equals("그만"))
                break;
            int score = scanner.nextInt();
            Set<String> keys = h.keySet();
            Iterator<String> it = keys.iterator();
            while(it.hasNext()){
                String hasName = it.next();
                if(hasName.equals(name))
                    score += h.get(hasName);
            }
            h.put(name,score);
            it = keys.iterator();
            while(it.hasNext()){
                String hasName = it.next();
                System.out.print("(" + hasName + "," + h.get(hasName) + ") ");
            }
            System.out.println();
        }
    }
}
