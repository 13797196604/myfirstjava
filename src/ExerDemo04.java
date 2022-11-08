import java.util.Scanner;

public class ExerDemo04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in );
        System.out.println("请输入学生人数:");
        int number = scanner.nextInt();
        int[] scores = new int[number];
        System.out.println("请输入" + number +"个成绩");
        for (int i = 0;i<scores.length;i++){
            scores[i]=scanner.nextInt();
        }
        int max = 0 ;
        for (int i = 0; i<scores.length;i++){
            if (max<scores[i]){
                max=scores[i];
            }
        }
        char leve1;
        for (int i =0;i<scores.length;i++){
            if (max - scores[i] <= 10){
                leve1='A';
            }else if (max - scores[i] <=20){
                leve1='B';
            } else if (max - scores[i] <=30) {
                leve1 = 'C';
            }else {
                leve1='D';
            }
            System.out.println("学生编号" + i + "学生成绩" + scores[i] + "学生等级" + leve1);
        }
    }
}
