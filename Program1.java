package task1;

import java.util.Scanner;

public class Program1 {
    public static void main(String[] args) {
        Student[] students = new Student[3];
        input(students);
        System.out.println("-------------------------------------");
        printStudents(students);

        avgRating(students);
        System.out.println("AvgRating: "+Student.avgRating);
        System.out.println("-------------------------------------");
        System.out.println("Students sorted by rating: ");
        sortStudents(students);
        printStudents(students);

    }
    public static void printStudents(Student[] students){
        for (int i=0;i< students.length;i++){
            System.out.println(students[i]);
        }
    }
    public static void input(Student[] students){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<students.length;i++){
            students[i] = new Student();
            System.out.println("Enter Name: ");
            String name = scanner.next();
            students[i].setName(name);
            System.out.println("Enter rating: ");
            int rating = scanner.nextInt();
            students[i].setRating(rating);
        }
        scanner.close();
    }
    public static void avgRating(Student[] students){
        int sum = 0;
        for (int i = 0; i< students.length;i++){
            sum+=students[i].getRating();
        }
        double result = (double) sum/ (double) students.length;
        Student.avgRating = result;
    }
    public static void sortStudents(Student[] students){
        Student temp = new Student();
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getRating() < students[j].getRating()) {
                    temp = students[i];
                    students[i] = students[j];
                    students[j] = temp;
                }
            }
        }

    }

}
