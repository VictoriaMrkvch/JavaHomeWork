package HomeworkExceptions.Task4;

import java.util.ArrayList;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<Integer>();
        int number = 0;
         for (int i = 0; i < 10; i++) {
             try {
                 number = readNumber(1, 100);
                 integers.add(number);
             } catch (ArithmeticException e) {
                 System.out.println("Value out of range");
             } catch (Exception e) {
                 System.out.println("Error!");
             }
         }

        for (Integer i : integers) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static int readNumber(int start, int end){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int a = scanner.nextInt();
        if(a <= start || a >= end){
            throw new ArithmeticException();
        }else{
            return a;
        }
    }
}
