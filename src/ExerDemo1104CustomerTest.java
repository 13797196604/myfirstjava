public class ExerDemo1104CustomerTest {
    public static void main(String[] args) {
        ExerDemo1104Customer cust = new ExerDemo1104Customer("Jane","Smith");
        ExerDemo1104Account acct  = new ExerDemo1104Account(1000,2000,0.0123);

        cust.setExerDemo1104Account(acct);

        cust.getExerDemo1104Account().deposit(100);
        cust.getExerDemo1104Account().withdraw(960);
        cust.getExerDemo1104Account().withdraw(2000);

    }
}
