package day13.exer02;

public class CircleTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1);
        Circle c2 = new Circle(1,"sdas",2);
        System.out.println(c1.getColor().equals(c2.getColor()));
        c1.toString();
    }
}
