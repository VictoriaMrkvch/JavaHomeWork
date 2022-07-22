package Task2;

import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {

        Employee[] employees = new Employee[3];
        input(employees);
        System.out.println();
        printEmployees(employees);
        System.out.println("The total salary of all workers : "+totalSalary(employees));

    }
    public static void input(Employee[] employees){
        Scanner scanner = new Scanner(System.in);
        for( int i=0;i< employees.length;i++){
            employees[i] = new Employee();
            System.out.println("Enter name: ");
            employees[i].setName(scanner.next());
            System.out.println("Enter rate : ");
            employees[i].setRate(scanner.nextInt());
            System.out.println("Enter hours: ");
            employees[i].setHours(scanner.nextInt());
        }
        scanner.close();
    }
    public static void printEmployees(Employee[] employees){
        for(int i=0;i< employees.length;i++){
            System.out.println(employees[i]);
        }
    }
    public static int totalSalary(Employee[] employees){
        int sum = 0;
        for(int i=0;i< employees.length;i++){
            sum+=employees[i].getSalary();
        }
        Employee.totalSum = sum;
        return sum;
    }
}
