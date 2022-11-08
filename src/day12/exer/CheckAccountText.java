package day12.exer;

public class CheckAccountText {
    public static void main(String[] args) {
        CheckAccount check = new CheckAccount(1122,20000,0.045,5000);
        check.withdraw(5000);
        check.withdraw(18000);
        check.withdraw(3000);
    }
}
