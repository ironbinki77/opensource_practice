package chap08.practice;

import java.io.File;
import java.util.NoSuchElementException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("***** 파일 탐색기 입니다. *****");
        String path = "C:\\";
        File f = new File(path);
        File[] subfiles = f.listFiles();
        System.out.println("[" + path + "]");
        for(int i=0;i< subfiles.length;i++){
            if(subfiles.length>5 && i == 3){
                System.out.println("------------- 생략하였습니다. -------------");
                i = subfiles.length-2;
            }
            if(subfiles[i].isFile())
                System.out.print("file   ");
            else
                System.out.print("dir    ");
            System.out.println(subfiles[i].length() + "바이트\t\t" + subfiles[i].getName());
        }

        while(true){
            System.out.print(">>");
            String s = scanner.nextLine();
            StringTokenizer st = new StringTokenizer(s);
            String next = st.nextToken();

            if(next.equals("그만"))
                break;
            else if(next.equals(".."))
                path = f.getParent();
            else if(next.equals("rename")){
                try{
                    String before = st.nextToken();
                    String after = st.nextToken();
                    File cn = new File(path + "\\" + before);
                    cn.renameTo(new File(path + "\\" +after));
                    System.out.println(before + "를" + after + "로 이름 변경했습니다.");
                } catch (NoSuchElementException e){
                    System.out.println("두 개의 파일명이 주어지지 않았습니다...!");
                }
            }
            else if(next.equals("mkdir")){
                String name = st.nextToken();
                File nd = new File(path + "\\" + name);
                nd.mkdir();
                System.out.println(name + "디렉터리를 생성했습니다");
            }
            else
                path = f + "\\" + next;

            f = new File(path);
            subfiles = f.listFiles();

            System.out.println("[" + path + "]");
            for(int i=0;i< subfiles.length;i++){
                if(subfiles.length>5 && i == 3){
                    System.out.println("------------- 생략하였습니다. -------------");
                    i = subfiles.length-2;
                }
                if(subfiles[i].isFile())
                    System.out.print("file   ");
                else
                    System.out.print("dir    ");
                System.out.println(subfiles[i].length() + "바이트\t\t" + subfiles[i].getName());
            }
        }
    }
}
