public class ExerDemo110402Account {
    private double balance;
    public ExerDemo110402Account(double init_balance){
        this.balance = init_balance;
    }
    public double getBAlance(){
        return balance;
    }
    //存钱功能
    public void deposit(double amt){
        if (amt > 0){
            balance += amt;
            System.out.println("存钱成功");
        }
    }
    public void withdraw(double amt){
        if (amt <= balance){
            balance -= amt;
            System.out.println("取钱成功");
        }else{
            System.out.println("取款失败");
        }
    }
}
