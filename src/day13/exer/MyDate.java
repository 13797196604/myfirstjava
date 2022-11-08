package day13.exer;

public class MyDate {
    private int a;
    private int b;
    private int c;
    public MyDate(int a,int b,int c){
        super();
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void setA(int a){
        this.a = a;
    }
    public int getA(){
        return a;
    }
    public void setB(int b){
        this.b = b;
    }
    public int getB(){
        return b;
    }
    public void setC(int c){
        this.c = c;
    }
    public int getC(){
        return c;
    }
    public boolean equals(Object o) {
        if (this == o){
            return true;
        }
        if (o instanceof MyDate){
            MyDate myDate = (MyDate)o;
            return this.a == ((MyDate) o).a && this.b == ((MyDate) o).b && this.c == ((MyDate) o).c;
        }
        return false;
    }
}
