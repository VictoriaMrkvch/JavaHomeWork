package Task1;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Bird> array = new ArrayList<Bird>();
        Bird bird1 = new Eagle("Eagle", true);
        Bird bird2 = new Swallow("swallow",true);
        Bird bird3 = new Penguin("Penguin", true);
        Bird bird4 = new Chicken("Chicken",true);
        array.add(bird1);
        array.add(bird2);
        array.add(bird3);
        array.add(bird4);

        for (int i = 0; i < array.size(); i++) {
            array.get(i).fly();
        }
    }
}
