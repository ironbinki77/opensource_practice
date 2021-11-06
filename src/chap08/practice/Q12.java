package chap08.practice;
import java.io.*;
import java.util.*;

public class Q12 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String word,c;
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String s1 = scanner.nextLine();

        while(true){
            BufferedReader br = new BufferedReader(new FileReader(s1));
            int lineNumber = 1;
            System.out.print("검색할 단어나 문장>>");
            word = scanner.nextLine();
            if(word.equals("그만"))
                break;
            while ((c = br.readLine()) != null){
                if(c.contains(word)){
                    System.out.printf("%4d: ",lineNumber);
                    System.out.println(c);
                }
                lineNumber++;
            }
        }
    }
}