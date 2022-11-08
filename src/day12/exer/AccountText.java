package day12.exer;

public class AccountText {
    public static void main(String[] args) {
        Account acc = new Account(1122,20000,0.045);
        //acc.withdraw(30000);
        acc.withdraw(2500);
        acc.deposit(3000);
        System.out.println(acc.getMonthlylnterest());
        System.out.println(acc.getBalance());
    }
}
