package chap08.practice;

import java.io.*;
import java.util.*;

public class Q10 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Temp\\phone.txt"));
        String c,name;
        HashMap<String,String> hm = new HashMap<>();
        Scanner scanner = new Scanner(System.in);

        while ((c = br.readLine()) != null) {
            StringTokenizer st = new StringTokenizer(c);
            hm.put(st.nextToken(),st.nextToken());
        }
        br.close();

        System.out.println("총 " + hm.size() + "개의 전화번호를 읽었습니다.");
        while(true) {
            System.out.print("이름>>");
            name = scanner.next();
            if(name.equals("그만"))
                break;
            if(hm.containsKey(name))
                System.out.println(hm.get(name));
            else
                System.out.println("찾는 이름이 없습니다.");
        }
    }
}
