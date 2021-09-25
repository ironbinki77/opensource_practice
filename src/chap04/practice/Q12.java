package chap04.practice;
import java.util.Scanner;

class Reserve{
    private String seat[] = new String[10];

    public Reserve(){
        for(int i=0;i<seat.length;i++)
            seat[i] = "---";
    }
    public void show(){
        for(int i=0;i<seat.length;i++)
            System.out.print(seat[i] + " ");
        System.out.println("");
    }
    public int compare(String name){
        for(int i=0;i<seat.length;i++){
            if(seat[i].equals(name))
                return i;
        }
        return -1;
    }
    public void change(String name, int num){
        seat[num-1] = name;
    }
    public String get(int num){
        return seat[num];
    }
}
public class Q12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Reserve [] reserves = new Reserve[3];
        for(int i=0;i<3;i++)
            reserves[i] = new Reserve();

        System.out.println("명품콘서트홀 예약 시스템입니다.");
        while(true){
            System.out.print("예약:1, 조회:2, 취소:3, 끝내기:4>>");
            int num = scanner.nextInt();
            if(num==4)
                break;
            switch (num){
                case 1:
                    while(true){
                        System.out.print("좌석구분 S(1), A(2), B(3)>>");
                        int lineNum = scanner.nextInt();
                        if(lineNum<=3){ // 좌석을 범위 이내로 선택 했을 경우
                            while(true){
                                switch (lineNum){
                                    case 1:
                                        System.out.print("S>> ");
                                        break;
                                    case 2:
                                        System.out.print("A>> ");
                                        break;
                                    case 3:
                                        System.out.print("B>> ");
                                        break;
                                }
                                reserves[lineNum-1].show();
                                System.out.print("이름>>");
                                String name = scanner.next();
                                System.out.print("번호>>");
                                try {
                                    int seatNum = scanner.nextInt();
                                    if(reserves[lineNum-1].get(seatNum-1)=="---") { // 예약하지 않은 자리를 고른 경우
                                        reserves[lineNum-1].change(name,seatNum);
                                        break;
                                    }
                                    else // 이미 예약된 자리를 고른 경우
                                        System.out.println("이미 예약된 자리입니다. 다시 입력해 주세요.");
                                }
                                catch (ArrayIndexOutOfBoundsException e){ // seat 배열의 범위를 넘어서 입력한 경우
                                    System.out.println("없는 좌석입니다. 다시 입력해 주세요.");
                                }
                            }
                            break;
                        }
                        else // 좌석을 범위 밖으로 선택 했을 경우
                            System.out.println("없는 좌석입니다. 다시 입력해 주세요.");
                    }
                    break;
                case 2:
                    System.out.print("S>> ");
                    reserves[0].show();
                    System.out.print("A>> ");
                    reserves[1].show();
                    System.out.print("B>> ");
                    reserves[2].show();
                    System.out.println("<<<조회를 완료하였습니다.>>>");
                    break;
                case 3:
                    while(true){
                        System.out.print("좌석 S:1, A:2, B:3>>");
                        int lineNum = scanner.nextInt();
                        if(lineNum<=3){ // 좌석을 범위 내로 선택한 경우
                            while(true){
                                switch (lineNum){
                                    case 1:
                                        System.out.print("S>> ");
                                        break;
                                    case 2:
                                        System.out.print("A>> ");
                                        break;
                                    case 3:
                                        System.out.print("B>> ");
                                        break;
                                }
                                reserves[lineNum-1].show();
                                System.out.print("이름>>");
                                String name = scanner.next();
                                if(reserves[lineNum-1].compare(name) >= 0){
                                    reserves[lineNum-1].change("---",reserves[lineNum-1].compare(name)+1);
                                    break;
                                }
                                else // 없는 이름을 취소하려한 경우
                                    System.out.println("없는 이름입니다. 다시 입력해 주세요.");
                            }
                            break;
                        }
                        else // 좌석을 범위 밖으로 선택한 경우
                            System.out.println("없는 좌석입니다. 다시 입력해 주세요.");
                    }
                    break;
                default:  //메뉴를 잘못 선택했을 경우
                    System.out.println("없는 메뉴입니다. 다시 입력해 주세요.");
            }
        }
    }
}
