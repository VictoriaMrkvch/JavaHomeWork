package task2;

public class Envelope {
    private double side1;
    private double side2;

    public Envelope() {
    }
    public Envelope(double side1, double side2) {
        this.side1 = side1;
        this.side2 = side2;
    }

    public double getSide1() {
        return side1;
    }
    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }
    public boolean canPutOneInAnother(Envelope e){
        return (this.side2*this.side2)>(e.side2*e.side1);
    }



}
