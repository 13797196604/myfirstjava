package day14;

public class SingletonTest1402 {
    public static void main(String[] args) {
        Order order1 = Order.getInstance();
        Order order2 = Order.getInstance();
        System.out.println(order1 == order2);
    }
}
//懒汉式
class Order{
    private Order(){

    }
    private static Order instance = null;

    public static Order getInstance() {
        if (instance == null){
            instance = new Order();
        }
        return instance;
    }
}
