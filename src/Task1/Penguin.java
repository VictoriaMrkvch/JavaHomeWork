package Task1;

public class Penguin extends NonFlyingBird {

    public Penguin() {
    }

    public Penguin(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am penguin and I can`t fly");
    }
}
