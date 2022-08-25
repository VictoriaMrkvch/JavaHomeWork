package HomeworkExceptions.Task1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        try{
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            System.out.println(squareRectangle(a,b));
        }catch (ArithmeticException e){
            System.out.println("You entered a negative value");
        }catch (Exception e){
            System.out.println("You entered not a number");
        }
        scanner.close();
    }
    public static int squareRectangle (int a, int b){
        if (a<=0 || b<=0){
            throw new ArithmeticException();
        }
        return a*b;
    }
}
