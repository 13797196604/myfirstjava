package day13.exer;

public class GeometricTest {
    public static void main(String[] args) {
        Circle c1 = new Circle(1,"be",3);
        Circle c2 = new Circle(2,"ww",3);
        GeometricTest test = new GeometricTest();

        test.displayGeometricObject(c2);
        test.displayGeometricObject(c1);
        boolean area = test.equalsArea(c1, c2);
        System.out.println(area);
    }
    public boolean equalsArea(GeometricObject o1,GeometricObject o2){
        return o1.findArea() == o2.findArea();
    }
    public void displayGeometricObject(GeometricObject o){
        System.out.println("面积为:" + o.findArea());
    }
}
