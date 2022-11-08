package day13;

import org.junit.Test;

public class WrapperTest {
    @Test
    public void test3(){
        int num1 = 10;
        String str1 = num1 + "";
        float f1 = 12.3f;
        String str2 = String.valueOf(12.3f);
        System.out.println(str2);
        String str3 = "123";
        int i1 = Integer.parseInt(str3);
        System.out.println(i1);
    }
    @Test
    public void test2(){
        Integer in1 = new Integer(12);
        int i1 = in1.intValue();
        System.out.println(i1);
    }
    @Test
    public void test1(){
    int num1 = 10;
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
    }
}
