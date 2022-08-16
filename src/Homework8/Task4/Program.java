package Homework8.Task4;

import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        Map<String, String> personMap = new HashMap<String, String>();
        personMap.put("Remo","Falcone");
        personMap.put("Nino","Falcone");
        personMap.put("Luca","Vittielo");
        personMap.put("Matteo","Markevych");
        personMap.put("Romero","Bilous");
        personMap.put("Aria","Morrety");
        personMap.put("Serafina","Torrichely");
        personMap.put("Nevio","Falcone");
        personMap.put("Savio","Yakobshe");
        personMap.put("Adamo","Scudery");
        printMap(personMap);
        System.out.println(hasTheSameLastname(personMap));
        System.out.println("---------------------------------------");
        remove(personMap);
        printMap(personMap);

    }
    public static void remove(Map<String,String> map){
        String name = "Bilous";
        String key = "";
        if(map.containsValue(name)){
            for (Map.Entry<String, String> entry : map.entrySet()) {
                if(entry.getValue().equals(name)){
                    key = entry.getKey();
                }
            }
            map.remove(key);
        }
    }
    public static boolean hasTheSameLastname(Map<String,String> map){
        String name = "";
        for (Map.Entry<String, String> entry : map.entrySet()) {
            int count = 0;
            name = entry.getValue();
            for (Map.Entry<String, String> entry1 : map.entrySet()) {
               if (entry1.getValue().equals(name)){
                   count++;
               }
            }
            if(count>=2){
                return true;
            }
            count = 0;
        }
        return false;
    }
    public static void printMap(Map<String,String> map){
        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
