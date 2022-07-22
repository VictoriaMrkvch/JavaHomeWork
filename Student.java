package task1;

public class Student {
    private String name;
    private int rating;
    static double avgRating;
    public Student(){
    }
    public Student(String name, int rating){
        this.name = name;
        this.rating = rating;
    }
    public String getName(){
        return this.name;
    }
    public double getRating(){
        return this.rating;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setRating(int rating){
        this.rating =rating;
    }
    public boolean betterStudent(Student student){
        boolean result = false;
        if (this.rating>student.rating)result=true;
        return result;
    }
    public String toString(){
        return "Name: "+this.name+", rating: "+this.rating;
    }


}
