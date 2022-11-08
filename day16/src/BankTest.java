public class BankTest {
}

class Bank{
    private Bank(){

    }
    private static Bank instance = null;
    private static synchronized Bank getInstance(){
         if (instance == null){
            instance = new Bank();
        }
        return instance;
    }
}