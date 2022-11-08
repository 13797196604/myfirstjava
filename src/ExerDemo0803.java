public class ExerDemo0803{
    public static void main(String[] args) {
        method m1 =new method();
        int area = m1.method(9,8);
        System.out.println(area);
    }
}
class method{
    public int method(int m ,int n){
        for (int i = 0;i<m;i++){
            for (int j = 0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println("");
        }
        return m*n;
    }
}
