package HomeworkExceptions.Task2;

import java.util.ArrayList;

import static HomeworkExceptions.Task2.Color.*;
import static HomeworkExceptions.Task2.Type.*;

public class Program {
    public static void main(String[] args) {
        Plant plant1 = new Plant(12,Green,Type2);
        Plant plant2 = new Plant(10,Red,Type1);
        Plant plant3 = new Plant(9,Blue,Type3);
        Plant plant4 = new Plant(22,White,Type4);
        Plant plant5 = new Plant(32,Green,Type1);

        ArrayList<Plant> plants = new ArrayList<Plant>();
        plants.add(plant1);
        plants.add(plant2);
        plants.add(plant3);
        plants.add(plant4);
        plants.add(plant5);

        for (Plant p: plants) {
            System.out.println(p);
        }

    }
}
