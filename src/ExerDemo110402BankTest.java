public class ExerDemo110402BankTest {
    public static void main(String[] args) {
        ExerDemo110402Bank bank = new ExerDemo110402Bank();
        bank.addExerDemo110402Customer("zhou","mingtao");
        bank.getExerDemo110402Customer(0).setExerDemo110402Account(new ExerDemo110402Account(2000));
        bank.getExerDemo110402Customer(0).getExerDemo110402Account().withdraw(2000);
        bank.getExerDemo110402Customer(0).getExerDemo110402Account().getBAlance();
        System.out.println(bank.getExerDemo110402Customer(0).getExerDemo110402Account().getBAlance());
        System.out.println("银行客户的个数:"+bank.getNumberOfExerDemo110402Customers());
    }
}
