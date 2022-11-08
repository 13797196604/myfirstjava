package day15;

public class MyDate15 {
    private int year;
    public int month;
    public int day;

    public MyDate15(){

    }
    public MyDate15(int year,int month ,int day){
        super();
        this.year = year;
        this.month = month;
        this.day = day;
    }
    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String toDateString(){
        return year + "年" + month + "月" + day + "日";
    }
}
