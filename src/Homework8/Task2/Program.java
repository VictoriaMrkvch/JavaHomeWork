package Homework8.Task2;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Map<Integer,String> employeeMap = new HashMap<Integer, String>();
        employeeMap.put(1,"Victoria");
        employeeMap.put(2,"Niko");
        employeeMap.put(3,"Remo");
        employeeMap.put(4,"Luca");
        employeeMap.put(5,"Matteo");
        employeeMap.put(6,"Greta");
        employeeMap.put(7,"Nino");
        printMap(employeeMap);
        findValue(employeeMap);
        findKey(employeeMap);

    }
    public static void findKey(Map<Integer,String> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name to find: ");
        String name = scanner.next();
        if(map.containsValue(name)){
            for (Map.Entry<Integer, String> entry: map.entrySet()) {
                if (name.equals(entry.getValue())) {
                    System.out.println(entry.getKey());
                }
            }
        }
        else{
            System.out.println("There is no such name in our map!!!");
        }

    }
    public static void findValue(Map<Integer,String> map){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id to find name: ");
        int id = scanner.nextInt();
        if(map.containsKey(id)){
            System.out.println(map.get(id));
        }
        else {
            System.out.println("There is no such id in our map!!!");
        }
    }
    public static void printMap(Map<Integer,String> map){
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
