package task2;

import java.util.Locale;
import java.util.Scanner;

public class Output {
    public static void output(){
        Scanner scanner = new Scanner(System.in);
        String exit = "";
        do {
            Envelope e1 = Input.input();
            Envelope e2 = Input.input();
            System.out.println(e1.canPutOneInAnother(e2));
            exit = scanner.next();
        }while (exit.toLowerCase().equals("yes")||exit.toLowerCase().equals("y"));
    }
}
