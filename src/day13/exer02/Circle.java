package day13.exer02;

public class Circle extends GeometricObject{
    private double radius;
    public Circle(){
        super();
        color = "white";
        weight = 1.0;
        radius = 1.0;
    }
    public Circle(double radius){
        super();
        color = "white";
        weight = 1.0;
        this.radius = radius;
    }
    public Circle(double radius,String color,double weight){
        super(color,weight);
        this.radius = radius;
    }
    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public double findArea(){
        return Math.PI * Math.PI *radius;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Circle){
            Circle circle = (Circle) obj;
            return this.radius == ((Circle) obj).radius  ;
        }
        return false;
    }
    public String toString(){
        return "Circle[radius="+radius+"]";
    }
}
