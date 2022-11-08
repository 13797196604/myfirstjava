package day14;

public class Account14 {
    private int id;
    private String pwd = "000000";
    private double balance;
    private static double interestRatr;
    private static double minMoney = 1.0;
    private static int init = 1001;//自动生成id

    public Account14(){
        id = init++;
    }
    public Account14(String pwd,double balance){
        this();
        this.pwd = pwd;
        this.balance = balance;
    }

    public int getId(){
        return id;
    }
    public String getPwd(){
        return pwd;
    }
    public void setPwd(String pwd){
        this.pwd = pwd;
    }
    public double getBalance(){
        return balance;
    }
    public static double getInterestRatr(){
        return interestRatr;
    }
    public static void setInterestRatr(double interestRatr){
        Account14.interestRatr = interestRatr;
    }
    public static double getMinMoney(){
        return minMoney;
    }
    public static void setMinMoney(double minMoney){
        Account14.minMoney = minMoney;
    }

    @Override
    public String toString() {
        return "Account14{" +
                "id=" + id +
                ", pwd='" + pwd + '\'' +
                ", balance=" + balance +
                '}';
    }
}
