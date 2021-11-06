package chap08.practice;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Q2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("C:\\Temp\\phone.txt"));
        try{
            String c;
            System.out.println("C:\\Temp\\phone.txt를 출력합니다.");
            while ((c = br.readLine()) != null) {
                System.out.println(c);
            }
        } catch (IOException e){
            System.out.println("오류!");
        }
        br.close();
    }
}
