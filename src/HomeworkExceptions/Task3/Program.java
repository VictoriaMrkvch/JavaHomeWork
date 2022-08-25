package HomeworkExceptions.Task3;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        System.out.println("Enter two double");
        try{
            double a = scanner.nextDouble();
            double b = scanner.nextDouble();
            System.out.println(div(a,b));
        }catch (ArithmeticException e){
            System.out.println("Div by zero");
        }catch (Exception e){
            System.out.println("You entered not a double");
        }

        scanner.close();
    }
    public static double div(double a, double b){
        if (b==0){
            throw new ArithmeticException();
        }
        return a/b;
    }
}
