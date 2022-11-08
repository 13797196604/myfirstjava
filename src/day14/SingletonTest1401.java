package day14;

public class SingletonTest1401  {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}
//饿汉式
class Bank{
    // 私有化构造器
    private Bank(){

    }

    //内部创建类的对象
    //要求此对象必须为静态
    private static Bank instance = new Bank();

    //提供公共的方法,返回类的对象。
    public static Bank getInstance(){
        return instance;
    }
}
