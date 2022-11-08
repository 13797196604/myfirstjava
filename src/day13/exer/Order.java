package day13.exer;

public class Order {
    private int orderId;
    private String orderName;
    public Order(int orderId,String orderName){
        super();
        this.orderId = orderId;
        this.orderName = orderName;
    }
    public void setOrderId(int ordeId){
        this.orderId = orderId;
    }
    public void setOrderName(String orderName){
        this.orderName = orderName;
    }
    public int getOrderId(){
        return orderId;
    }
    public String getOrderName(){
        return orderName;
    }
    public boolean equals(Object obj){
        if (this == obj){
            return true;
        }
        if (obj instanceof Order){
            Order order = (Order)obj;
            return this.orderId == order.orderId && this.orderName.equals(order.orderName);
        }
        return false;
    }
}