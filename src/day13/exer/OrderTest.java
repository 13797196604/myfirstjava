package day13.exer;

public class OrderTest {
    public static void main(String[] args) {
        Order order1 = new Order(1,"sd");
        Order order2 = new Order(1,"sd");
        System.out.println(order1.equals(order2));
    }
}
