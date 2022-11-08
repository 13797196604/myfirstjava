package day13.exer03;

import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Vector v = new Vector();
        int maxScore = 0;
        for (; ; ) {
            System.out.println("请输入学生成绩(输入负数表示结束):");
            int score = scanner.nextInt();
            if (score < 0) {
                break;
            }
            if (score > 100) {
                System.out.println("输入的数据非法,请重新输入。");
                continue;
            }
            v.addElement(score);
            if (maxScore < score) {
                maxScore = score;
            }
        }
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            //Integer inScore = (Integer) obj;
            //int score = inScore.intValue();
            int score = (int) obj;
            if (maxScore - score <= 10) {
                level = 'A';
            } else if (maxScore - score <= 20) {
                level = 'B';
            }else if (maxScore - score <= 30) {
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println(i+","+score+"," + level);
        }
    }
}