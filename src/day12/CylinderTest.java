package day12;

public class CylinderTest {
    public static void main(String[] args) {
        Cylinder c1 = new Cylinder();
        c1.setRadius(3);
        c1.setLength(2);
        double volume = c1.findVolume();
        System.out.println(volume);
    }
}
