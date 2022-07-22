package Task3;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private int birthYear;

    public void setFirstName(String firstName){this.firstName = firstName;}
    public String getFirstName(){return this.firstName;}
    public void setLastName(String lastName){this.lastName=lastName;}
    public String getLastName(){return this.lastName;}
    public void setBirthYear(int birthYear){this.birthYear=birthYear;}
    public int getBirthYear(){return this.birthYear;}

    public Person(){}
    public Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge(){
        return 2022-this.birthYear;
    }

    public void input(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Name: ");
        this.setFirstName(scanner.next());
        this.setLastName(scanner.next());
        System.out.println("Enter birthYear");
        this.setBirthYear(scanner.nextInt());
    }
    public String toString(){
        return "Name: "+this.firstName+" "+this.lastName+", birthYear: "+this.birthYear;
    }
    public void changeName(String fn, String ln){
        this.setFirstName(fn);
        this.setLastName(ln);
    }
    public void changeName(String name, int value){
        if(value == 0)this.setFirstName(name);
        else if (value == 1)this.setLastName(name);

    }

}
