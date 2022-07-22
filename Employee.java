package Task2;

public class Employee {
    private String name;
    private int rate;
    private int hours;
    static int totalSum;

    public void setName(String name){this.name = name;}
    public String getName(){return this.name;}
    public void setRate(int rate){this.rate=rate;}
    public int getRate(){return this.rate;}
    public void setHours(int hours){this.hours=hours;}
    public int getHours(){return this.hours;}

    public Employee(){}
    public Employee(String name, int rate){
        this.name = name;
        this.rate = rate;
    }
    public Employee(String name, int rate, int hours){
        this.name = name;
        this.rate = rate;
        this.hours = hours;
    }
    public int getSalary(){
        return this.rate*this.hours;
    }
    public String toString(){
        return "Name: "+this.name+", rate: "+this.rate+", hours: "+this.hours;
    }
    public int changeRate(int rate){
        this.setRate(rate);
        return this.getSalary();
    }
    public double getBonuses(){
        return ((double) this.getSalary())*0.1;
    }
}
