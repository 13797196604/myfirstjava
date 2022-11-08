public class ExerDemo0802 {
    public static void main(String[] args) {
        Circle c1 =new Circle();
        c1.r=2.1;
        double area = c1.findArea();
        System.out.println(area);
    }
}
class Circle{
    // 属性
    double r;
    // 求圆面积的方法
    public double findArea(){
        double area = Math.PI * r * r;//Math.PI=3.1415926......
        return area;
    }
}
