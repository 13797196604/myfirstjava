public class ExerDemo110402Customer {
    private String firstName;
    private String lastName;
    private ExerDemo110402Account ExerDemo110402Account;
    public ExerDemo110402Customer(String f , String l){
        this.firstName = f;
        this.lastName = l;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public ExerDemo110402Account getExerDemo110402Account(){
        return ExerDemo110402Account;
    }
    public void setExerDemo110402Account(ExerDemo110402Account ExerDemo110402Account){
        this.ExerDemo110402Account = ExerDemo110402Account;
    }
}
