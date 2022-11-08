package day12.exer;

public class Account {
    private int id;
    private double balance;
    private double annuallnterestRate;
    public Account(int id,double balance,double annuallnterestRate){
        this.id = id;
        this.balance = balance;
        this.annuallnterestRate = annuallnterestRate;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public double getBalance(){
        return balance;
    }
    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getAnnuallnterestRate(){
        return annuallnterestRate;
    }
    public void setAnnuallnterestRate(double annuallnterestRate){
        this.annuallnterestRate = annuallnterestRate;
    }
    public double getMonthlylnterest(){
        return (annuallnterestRate / 12);
    }
    public void withdraw(double amount){
        if (amount <= balance){
            balance -= amount;
            System.out.println("取款成功");
        }else{
            System.out.println("余额不足，取款失败");
            System.out.println("您的帐户余额为:" + balance);
        }
    }
    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
            System.out.println("存入成功");
        }else {
            System.out.println("请存入正确的金额。");
        }
    }
}
