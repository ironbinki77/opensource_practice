package chap08.practice;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new FileReader("c:\\windows\\system.ini"));
        int lineNumber = 1;
        while(scanner.hasNext()){
            String line = scanner.nextLine();
            System.out.printf("%4d: ",lineNumber);
            System.out.println(line);
            lineNumber++;
        }
        scanner.close();
    }
}
