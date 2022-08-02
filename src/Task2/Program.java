package Task2;

public class Program {
    public static void main(String[] args) {
        Employee employee = new Employee("Taras", 32, 32735.35);
        Developer developer = new Developer("Petro", 25, 25786.9, "Average Java developer");
        System.out.println(employee.report());
        System.out.println(developer.report());
    }
}
