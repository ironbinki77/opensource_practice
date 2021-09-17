//12번 문제
package chap03.practice;

public class Add {
    public static void main(String[] args) {
        int sum = 0;
        for (String arg : args) {
            try{
                int j = Integer.parseInt(arg);
                sum += j;
            }
            catch (NumberFormatException e){
            }
        }
        System.out.println(sum);
    }
}
