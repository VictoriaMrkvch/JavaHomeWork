package Task1;

public class Swallow extends FlyingBird{

    public Swallow() {
    }

    public Swallow(String feathers, boolean layEggs) {
        super(feathers, layEggs);
    }

    @Override
    public void fly() {
        System.out.println("I am swallow and I am flying");
    }
}
