import java.util.Scanner;

public class Doem02 {
    public static void main(String[] args) {
        Scanner zhou = new Scanner(System.in);
        System.out.println("请输入第一个整数:");
        int num1 = zhou.nextInt();
        System.out.println("请输入第2个整数:");
        int num2 = zhou.nextInt();
        System.out.println("请输入第3个整数:");
        int num3 = zhou.nextInt();

        if (num1 >= num2) {
            if (num3 >= num1) {
                System.out.println(num2 + "," + num1 + "," + num3);
            } else if (num3 <= num2) {
                System.out.println(num3 + "," + num2 + "," + num1);
            } else {
                System.out.println(num2 + "," + num3 + "," + num1);
            }
        }
        else{
                if (num3 >= num2){
                    System.out.println(num1+","+num2+","+num3);
                }else if (num3<=num1){
                    System.out.println(num3+","+num1+","+num2);
                }else {
                    System.out.println(num1+","+num3+","+num2);
                }
            }
        }
    }