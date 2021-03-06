package chap08.examples;
import java.io.*;

public class FileReadHangulSuccess {
    public static void main(String[] args) {
        InputStreamReader in = null;
        FileInputStream fin = null;
        try{
            fin = new FileInputStream("C:\\Temp\\hangul.txt");
            in = new InputStreamReader(fin, "UTF-8"); //MS949로 하면 글씨가 깨짐
            int c;

            System.out.println("인코딩 문자 집합은 " + in.getEncoding());
            while((c = in.read()) != -1){
                System.out.print((char)c);
            }
            in.close();
            fin.close();
        } catch (IOException e){
            System.out.println("입출력 오류");
        }
    }
}
