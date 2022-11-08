public class Demo0801 {
    public static void main(String[] args) {

    }
}
class Customer {
    // 属性
    String name;
    int age;
    boolean ifMale;
    //方法
    public void eat(){
        System.out.println("客户吃饭");
    }
    public void sleep(int hour){
        System.out.println("我休息了"+hour+"个小时");
    }
    public String getName() {
        return name;
    }
    public String getNation(String nation){
            String info ="我的国籍是"+nation;
            return info;
        }
}