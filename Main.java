import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Task 1
        System.out.print("Enter a: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Enter b: ");
        int secondNumber= scanner.nextInt();
        sum(firstNumber,secondNumber);
        sub(firstNumber,secondNumber);
        mult(firstNumber,secondNumber);
        div(firstNumber,secondNumber);

        //Task 2
        System.out.println("--------------------------------");
        System.out.println("How are you?");
        String answer = scanner.next();
        System.out.println("You are " + answer);


        //Task 3
        System.out.println("--------------------------------");
        double a = 20;
        double b = 30;
        double c = 18;
        double d = 22;
        double e = 26;
        double sABG = 0.5*(a*b);
        double g = Math.sqrt(Math.pow(a,2)+Math.pow(b,2));
        double sGCF = 0.5*(g*c);
        double f = Math.sqrt(Math.pow(g,2)+Math.pow(c,2));
        double p = (e+f+d)/2;
        double sEFD = Math.sqrt(p*(p-e)*(p-f)*(p-d));
        double S = sEFD+sABG+sGCF;
        System.out.println("S = "+S);


        //Task 4
        System.out.println("--------------------------------");
        double result = ((double)((2*factorial(5))+(3*factorial(8))))
                /((double)(factorial(6)+factorial(4)));

        System.out.println("(2*5!+3*8!)/(6!+4!) = " + result);

    }
    public static void sum(int a, int b){
        System.out.println(a + " + " + b + " = " + (a + b));
    }
    public static void sub(int a, int b){
        System.out.println(a + " - " + b + " = " + (a - b));
    }
    public static void mult(int a, int b){
        System.out.println(a + " * " + b + " = " + (a * b));
    }
    public static void div(int a, int b){
        System.out.println(a + " / " + b + " = " + ((double)a / (double) b));
    }
    public static int factorial(int n){
        int result = 1;
        for (int i=1;i<=n;i++){
            result *= i;
        }
        return result;
    }

}