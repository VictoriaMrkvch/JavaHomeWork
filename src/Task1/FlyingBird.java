package Task1;

public class FlyingBird extends Bird {

    public FlyingBird() {
    }

    public FlyingBird(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am flying");
    }
}
