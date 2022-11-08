public class ExerDemo1102 {
    public static void main(String[] args) {
        TriAngle a = new TriAngle();

    }
}
class TriAngle{
    // 私有的属性
    private double base;
    private double height;

    //构造器
    public TriAngle(){

    }

    public TriAngle(double b,double h){
        base=b;
        height=h;
    }

    //方法
    public void setBase(double b){
        if(b>0){
            base=b;
        }else{
            base=0;
        }
    }
    public double getBase(){
        return base;
    }
    public void setHeight(double h){
        if (h>0){
            height=h;
        }else{
            height=0;
        }
    }
    public double getHeight(){
        return height;
    }
}

