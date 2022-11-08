package day14;

public class CircleTest14 {
    public static void main(String[] args) {
        Circle14 c1 = new Circle14();
        Circle14 c2 = new Circle14();
        Circle14 c3 = new Circle14(3);
        System.out.println(c1.getId());
        System.out.println(c2.getId());
        System.out.println(c3.getId());
        System.out.println(Circle14.getTotal());
        System.out.println(c3.findArea());
    }
}

class Circle14{
    private double radius;
    private int id;
    private static int total;
    private static int init = 1001;

    public Circle14(){
        id = init++;
        total++;
    }
    public Circle14(double radius){
        this();
        this.radius = radius;
//        id = init++;
//        total++;
    }

    public double findArea(){
        return Math.PI * radius * radius;
    }

    public double getRadius(){
        return radius;
    }
    public void setRadius(double radius){
        this.radius = radius;
    }
    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public static int getTotal(){
        return total;
    }
}
