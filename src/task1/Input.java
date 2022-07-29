package task1;

import java.util.Scanner;

public class Input {
    public static int inputData(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size: ");
        int n = scanner.nextInt();
        return n;
    }
}
