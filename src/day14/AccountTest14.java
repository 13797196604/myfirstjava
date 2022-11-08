package day14;

public class AccountTest14 {
    public static void main(String[] args) {
        Account14 acc1 = new Account14();
        Account14 acc2 = new Account14("123456",1000000000);
        Account14.setInterestRatr(0.1);
        Account14.setMinMoney(100);
        System.out.println(acc1);
        System.out.println(acc2);
        System.out.println(acc1.getInterestRatr());
        System.out.println(acc1.getMinMoney());
    }
}
