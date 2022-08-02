package Task1;

public class Chicken extends NonFlyingBird{
    public Chicken() {
    }

    public Chicken(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am chicken and I can`t fly");
    }
}
