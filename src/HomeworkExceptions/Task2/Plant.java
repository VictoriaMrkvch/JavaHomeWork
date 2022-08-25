package HomeworkExceptions.Task2;

public class Plant {
    private int size;
    private Color color;
    private Type type;


    public Plant() {
    }

    public Plant(int size, Color color, Type type) {
        this.size = size;
        this.color = color;
        this.type = type;
    }

    @Override
    public String toString() {
        return this.size+", "+this.color+", "+this.type;
    }
}
