package Task3;

public class Program3 {
    public static void main(String[] args) {
        Person[] people = new Person[5];
        for(int i=0;i< people.length;i++){
            people[i] = new Person();
            people[i].input();
        }
        printPeople(people);

    }
    public static void printPeople(Person[] people){
        for(int i=0;i< people.length;i++){
            System.out.println(people[i]);
        }
    }
}
