package chap08.practice;

import java.io.File;

public class Q8 {
    public static void main(String[] args) {
        File f = new File("C:\\");
        File[] subfiles = f.listFiles();
        long max = subfiles[0].length();
        String max_path = subfiles[0].getPath();

        for(int i=0;i< subfiles.length;i++)
            if(subfiles[i].length()>max){
                max = subfiles[i].length();
                max_path = subfiles[i].getName();
            }

        System.out.println("가장 큰 파일은 " + max_path + " " + max + "바이트");
    }
}
