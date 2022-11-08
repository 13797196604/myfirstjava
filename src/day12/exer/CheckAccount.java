package day12.exer;

public class CheckAccount extends Account{
    private double overdraft;
    public CheckAccount(int id, double balance, double annuallnterestRate,double overdraft) {
        super(id, balance, annuallnterestRate);
        this.overdraft = overdraft;
    }
    public double getOverdraft(){
        return overdraft;
    }
    public void setOverdraft(double overdraft){
        this.overdraft = overdraft;
    }
    public void withdraw(double amount){
        if (amount <= getBalance()){
            super.withdraw(amount);
            //System.out.println("取款成功");
        }else if (overdraft >= amount - getBalance()){
            overdraft -= amount - getBalance();
            setBalance(0);
            System.out.println("取款成功");
        }else{
            System.out.println("超过可透支的限额");
        }
    }
}
