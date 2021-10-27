package chap07.practice;
import java.lang.reflect.Array;
import java.util.*;

class Word{
    String eng, kor;
    public Word (String eng, String kor){
        this.eng = eng;
        this.kor = kor;
    }
}

public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector<Word> v = new Vector<>();
        v.add(new Word("love","사랑"));
        v.add(new Word("animal","동물"));
        v.add(new Word("painting","그림"));
        v.add(new Word("bear","곰"));
        v.add(new Word("baby","아기"));
        v.add(new Word("eye","눈"));
        v.add(new Word("society","사회"));
        v.add(new Word("human","인간"));
        int num;

        System.out.println("**** 영어 단어 테스트 프로그램 \"명품영어\" 입니다. ****");
        while(true){
            System.out.println();
            System.out.print("단어 테스트:1, 단어 삽입:2, 종료:3>> ");
            num = scanner.nextInt();

            if(num == 3){
                System.out.println("\"명품영어\"를 종료합니다.");
                break;
            }

            switch (num){
                case 1:
                    System.out.println("현재 " + v.size() + "개의 단어가 들어 있습니다. -1을 입력하면 테스트를 종료합니다.");
                    while(true){
                        int i = (int)(Math.random()*(v.size()-1));
                        System.out.println(v.get(i).eng + "?");

                        ArrayList<String> answer = new ArrayList<>();
                        answer.add(v.get(i).kor);
                        while(answer.size() < 4){
                            String ran_answer = v.get((int)(Math.random()*(v.size()-1))).kor;
                            if(!answer.contains(ran_answer))
                                answer.add(ran_answer);
                        }

                        for(int k=0;k<4;k++){ // answer 안의 값 섞기
                            answer.add(answer.remove((int)(Math.random()*3)));
                        }

                        System.out.print("(1)" + answer.get(0) + " (2)" + answer.get(1) + " (3)" + answer.get(2) + " (4)" + answer.get(3) + " >>");

                        try{
                            num = scanner.nextInt();
                            if(num == -1)
                                break;
                            if(answer.get(num-1).equals(v.get(i).kor))
                                System.out.println("Excellent !!");
                            else
                                System.out.println("No. !!");
                        }catch (InputMismatchException e) {
                            System.out.println("숫자를 입력하세요 !!");
                            scanner.next();
                            continue;
                        }
                    }
                    break;
                case 2:
                    System.out.println("영어 단어에 그만을 입력하면 입력을 종료합니다.");
                    while(true){
                        System.out.print("영어 한글 입력 >> ");
                        String eng_word = scanner.next();
                        if(eng_word.equals("그만"))
                            break;
                        String kor_word = scanner.next();
                        v.add(new Word(eng_word,kor_word));
                    }
                    break;
            }
        }
    }
}
