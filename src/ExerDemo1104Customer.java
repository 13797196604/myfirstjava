public class ExerDemo1104Customer {
    private String firstName;
    private String lastName;
    private ExerDemo1104Account exerDemo1104Account;

    public ExerDemo1104Customer(String f,String l){
        this.firstName = f;
        this.lastName  = l;
    }

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public ExerDemo1104Account getExerDemo1104Account(){
        return exerDemo1104Account;
    }
    public void setExerDemo1104Account(ExerDemo1104Account exerDemo1104Account){
        this.exerDemo1104Account = exerDemo1104Account;
    }
}
