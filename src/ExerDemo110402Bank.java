public class ExerDemo110402Bank {
    private ExerDemo110402Customer[] ExerDemo110402Customers;// 可以存放多个客户的数组。
    private int numberOfExerDemo110402Customers;//记录客户的个数。

    public ExerDemo110402Bank(){
        ExerDemo110402Customers = new ExerDemo110402Customer[10];
    }
    //添加客户
    public void addExerDemo110402Customer(String f,String l){
        ExerDemo110402Customer cust = new ExerDemo110402Customer(f, l);
        ExerDemo110402Customers[numberOfExerDemo110402Customers] = cust;
        numberOfExerDemo110402Customers++;
    }
    //获取客户的个数
    public int getNumberOfExerDemo110402Customers(){
        return numberOfExerDemo110402Customers;
    }
    //获取指定位置上的客户。
    public ExerDemo110402Customer getExerDemo110402Customer(int index){
        if( index >= 0 && index < numberOfExerDemo110402Customers) {
            return ExerDemo110402Customers[index];
        }else {
            return null;
        }
    }
}
