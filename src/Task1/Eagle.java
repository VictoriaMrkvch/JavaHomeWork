package Task1;

public class Eagle extends FlyingBird{

    public Eagle() {
    }

    public Eagle(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am eagle and I am flying");
    }
}
