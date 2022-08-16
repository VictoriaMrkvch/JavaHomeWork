package Homework8.Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List myCollection = new ArrayList();
        for (int i = 0; i < 15; i++) {
            myCollection.add((int) (Math.random()*(100+1)) - 50);
        }
        printCollection(myCollection);

        List newCollection = new ArrayList();
        collectionOfPositions(myCollection, newCollection);
        printCollection(newCollection);

        removeGreaterThen20(myCollection);
        printCollection(myCollection);

        myCollection.add(2,1);
        myCollection.add(8,-3);
        myCollection.add(5,-4);
        printWithPositions(myCollection);

        Collections.sort(myCollection);
        printCollection(myCollection);

    }
    public static void printWithPositions(List list){
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("position - %d, value of element - %d\n",i, list.get(i));
        }
    }
    public static void removeGreaterThen20(List list){

        for (int i = 0; i < list.size(); ++i) {
            if(((int)list.get(i))>20){
                list.remove(i);
                i--;
            }
        }
    }
    public static void collectionOfPositions(List list, List newList){
        for (int i = 0; i < list.size(); i++) {
            if((int)list.get(i)>5){
                newList.add(i);
            }
        }
    }
    public static void printCollection(List list){
        for (Object i: list) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
}
