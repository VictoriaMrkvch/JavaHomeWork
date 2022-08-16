package Homework8.Task5;

import java.util.List;

public class Student {
    String name;
    int course;

    public Student() {
    }

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    @Override
    public String toString(){
        return this.name + " " + this.course;
    }
    public static void printStudents(List<Student> students, int course){
        System.out.println("Course : "+course);
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getCourse()==course){
                System.out.println(students.get(i).getName());
            }
        }
    }
}
