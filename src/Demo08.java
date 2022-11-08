public class Demo08 {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.name="Tom";
        p1.ifMale=true;
        System.out.println(p1.ifMale);
        System.out.println(p1.age);
        System.out.println(p1.name);
        p1.eat();
        p1.sleep();
        p1.talk("Chinese");

        Person p2 = new Person();
        System.out.println(p2.name);
        System.out.println(p2.ifMale);
        Person p3 = p1;
        System.out.println(p3.name);//Tom
        p3.age=10;
        System.out.println(p1.age);//10
    }
}
class Person{
    // 属性
    String name;
    int age =1;
    boolean ifMale;
    //方法
    public void eat(){
        System.out.println("人可以吃饭");
    }

    public void sleep(){
        System.out.println("人可以睡觉");
    }
    public void talk(String language){//language:形参,局部变量
        System.out.println("人可以说话,使用的是:"+language);
    }
    /*public void eat(){
        String food = "肉夹馍";//局部变量
        System.out.println("北方人喜欢吃:"+food);
    }*/
}

