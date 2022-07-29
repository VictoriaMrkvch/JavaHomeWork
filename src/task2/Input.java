package task2;

import java.util.Scanner;

public class Input {
    public static Envelope input(){
        System.out.println("Enter side 1:");
        Scanner scanner= new Scanner(System.in);
        Envelope e = new Envelope();
        e.setSide1(scanner.nextInt());
        System.out.println("Enter side 2:");
        e.setSide2(scanner.nextInt());
        return e;
    }
}
