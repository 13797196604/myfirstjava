public class ExerDemo1104Account {
    private int id;
    private double balance;
    private double annualInterestRate;

    public ExerDemo1104Account(int id,double balance,double annualInterestRate){
        this.id=id;
        this.balance=balance;
        this.annualInterestRate=annualInterestRate;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return id;
    }
    public void setBalance(double balance){
        this.balance=balance;
    }
    public double getBalance(){
        return balance;
    }
    public void setAnnualInterestRate(double annualInterestRate){
        this.annualInterestRate=annualInterestRate;
    }
    public double getAnnualInterestRate(){
        return annualInterestRate;
    }

    public void  withdraw (double amount){//取钱
        if(balance < amount) {
            System.out.println("余额不足，取款失败。");
            return;
        }
        balance -= amount;
        System.out.println("成功取款:"+amount);
    }

    public void deposit (double amount){//存钱
        if(amount > 0){
            balance += amount;
            System.out.println("成功存入:"+amount);
        }
    }
}
