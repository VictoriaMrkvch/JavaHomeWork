package Task1;

public class NonFlyingBird extends Bird {

    public NonFlyingBird() {
    }

    public NonFlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I can`t fly");
    }
}
