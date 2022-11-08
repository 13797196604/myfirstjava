package day15;

public abstract class Employee15 {
    private String name;
    private int number;
    private MyDate15 birthday;

    public abstract double earnings();

    public Employee15(){

    }
    public Employee15(String name , int number , MyDate15 birthday){
        super();
        this.name = name;
        this.number = number;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public MyDate15 getBirthday() {
        return birthday;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setBirthday(MyDate15 birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "name=" + name  + ",number=" + number +",birthday=" + birthday ;
    }
}
