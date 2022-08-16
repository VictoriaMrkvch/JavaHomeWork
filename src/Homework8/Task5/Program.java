package Homework8.Task5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("Nevio", 1));
        students.add(new Student("Alessio", 1));
        students.add(new Student("Savio", 2));
        students.add(new Student("Adamo", 2));
        students.add(new Student("Massimo", 1));
        Student.printStudents(students,1);
        Student.printStudents(students,2);
        Comparator<Student> comparator1 = Comparator.comparing(obj -> obj.getName());
        Comparator<Student> comparator2 = Comparator.comparing(obj -> obj.getCourse());
        Collections.sort(students, comparator1);
        System.out.println("------------------------------");
        printList(students);
        Collections.sort(students, comparator2);
        System.out.println("------------------------------");
        printList(students);

    }
    public static void printList(List<Student> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
