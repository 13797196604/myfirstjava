public class ExerDemo09 {
    public static void main(String[] args) {
        // 方法的调用。
        ExerDemo09 a1 =new ExerDemo09();
        a1.mOL("we");
    }
    public void mOL(int i){
        System.out.println(i*i);
    }
    public void  mOL(int i,int j){
        System.out.println(i*j);
    }
    public void  mOL(String i){
        System.out.println(i);
    }
}
