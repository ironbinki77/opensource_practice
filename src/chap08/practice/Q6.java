package chap08.practice;

import java.io.*;
import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String s1 = scanner.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String s2 = scanner.nextLine();
        File f1 = new File(s1);
        File f2 = new File(s2);
        int c;
        try{
            FileReader fr1 = new FileReader(f1);
            FileReader fr2 = new FileReader(f2);
            FileOutputStream fout = new FileOutputStream("C:\\Temp\\result.txt");
            while((c = fr1.read()) != -1){
                fout.write((char)c);
            }
            while((c = fr2.read()) != -1){
                fout.write((char)c);
            }
            fout.close(); fr1.close(); fr2.close();
            System.out.println("프로젝트 폴더 밑에 result.txt 파일에 저장하였습니다.");
        } catch (IOException e){
            System.out.println("파일 복사 오류");
        }
    }
}
