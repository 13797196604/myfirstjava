public class ExerDemo0801 {
    public static void main(String[] args) {
        Person0801 p1 = new Person0801();
        p1.name="Tom";
        p1.age=18;
        p1.sex=1;
        p1.study();
        p1.showAge();
        int newAge=p1.addAge(2);
        System.out.println(p1.name+"新年龄为:"+newAge);
        System.out.println(p1.age);//20
    }
}
class Person0801{
    // 属性
    String name;
    int age;
    /**
     * sex=1 为男性
     * sex=0 为女性
     */
    int sex;
    //方法
    public void study(){
        System.out.println("studying");
    }
    public void showAge(){
        System.out.println("age:"+age);
    }
    public int addAge(int i){
        age += i;
        return age;
    }
}