package Homework8.Task3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Program {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();
        randomSet(set1);
        randomSet(set2);
        printSet(set1);
        printSet(set2);
        union(set1,set2);
        intersect(set1,set2);

    }
    public static void  intersect(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(set1);
        set.retainAll(set2);
        printSet(set);
    }
    public static void union(Set<Integer> set1, Set<Integer> set2){
        Set<Integer> set = new HashSet<Integer>();
        set.addAll(set1);
        set.addAll(set2);
        printSet(set);
    }
    public static void printSet(Set<Integer> set){
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next()+" ");
        }
        System.out.println();
    }
    public static void randomSet(Set<Integer> set){
        for (int i = 0; i < 10; i++) {
            set.add((int) (Math.random()*(20+1)));
        }
    }

}
