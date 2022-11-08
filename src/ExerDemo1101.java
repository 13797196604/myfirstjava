public class ExerDemo1101 {
    public static void main(String[] args) {
        Person11 a = new Person11();
        a.setAge(999);
        System.out.println(a.getAge());
    }

}
class Person11{
    private int age;
    public void setAge(int i){
        if (i<130&&i>0){
            age=i;
        }else {
            age=-1;
        }
    }
    public int getAge(){
        return age;
    }
}
