public class Demo11 {
    // 封装
    public static void main(String[] args) {
        Animal a = new Animal();//实例化
        a.setLegs(6);
        System.out.println(a.getLegs());
        System.out.println(a.getAge());
    }
}
class Animal{
    // 属性
    private String name;
    private int age;
    private int legs;

    //构造器
    public Animal(){
    }

    //方法
    public void setAge(int a){
        age=a;
    }
    public int getAge(){
        return age;
    }
    public void setLegs(int l){
        if (l>=0&&l%2==0){
            legs = l;
        }else{
            legs = 0;
        }
    }
    public int getLegs(){
        return legs;
    }
}
