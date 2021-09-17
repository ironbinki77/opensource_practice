package chap03.practice;

public class Q10 {
    public static void main(String[] args) {
        int[][] arr = {{0,0,0,0},{0,0,0,0},{0,0,0,0},{0,0,0,0}};

        for(int i=0;i<10;i++){
            while(true){
                int j = (int)(Math.random()*4);
                int k = (int)(Math.random()*4);
                if(arr[j][k]==0){
                    arr[j][k] = (int)(Math.random()*10) + 1;
                    break;
                }
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
    }
}
