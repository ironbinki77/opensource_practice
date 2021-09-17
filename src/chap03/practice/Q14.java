package chap03.practice;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] course = {"Java","C++","HTML5","컴퓨터구조","안드로이드"};
        int[] score = {95,88,76,62,55};

        while(true){
            System.out.print("과목 이름>>");
            String Sub = scanner.next();
            if(Sub.equals("그만"))
                break;
            try{
                for(int i=0;i<=5;i++){
                    if(Sub.equals(course[i]))
                    {
                        System.out.println(course[i] + "의 점수는 " + score[i]);
                        break;
                    }
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("없는 과목입니다.");
            }
        }
        scanner.close();
    }
}
