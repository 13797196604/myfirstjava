package exer;

public class Exer001 {
    private int payment;
    private int spend;
    private int collection;
    public Exer001(int payment,int spend){
        this.payment = payment;
        this.spend =spend;
        this.collection = payment - spend;
    }
    public int getPayment(){
        return payment;
    }
    public void setPayment(int payment){
        this.payment = payment;
    }
    public int getSpend(){
        return spend;
    }
    public void setSpend(int spend){
        this.spend = spend;
    }
    public int getCollection(){
        return collection;
    }
    public void setCollection(int collection){
        this.collection = collection;
    }
    /*public int Collectint(){
        int a5000 = getCollection()/5000;
        int a1000 = getCollection()%5000/1000;
        int a500 = getCollection()%5000%1000/500;
        int a100 = getCollection()%5000%1000%500/100;
        int a50 = getCollection()%5000%1000%500%100/50;
        int a10 = getCollection()%5000%1000%500%100%50/10;
        int a1 = getCollection()%5000%1000%500%100%50%10/1;
        return 0;*/
    }
