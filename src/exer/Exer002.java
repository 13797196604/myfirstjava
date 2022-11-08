package exer;

public class Exer002 {
    public static void main(String[] args) {
        char[] a=new char[]{'a','b','c','d','e'};
        int[] b=new int[5];
        System.arraycopy(a, 0, b, 0, 2);
        for(int i=0;i<b.length;i++)
            System.out.print(b[i]+" ");
    }
}
