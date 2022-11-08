import java.util.Scanner;

        class Doem01 {
            public static void main(String[] args) {
                Scanner zhou = new Scanner(System.in);
                System.out.println("小周的成绩:");
                int score =zhou.nextInt();
                if (score ==100){
                    System.out.println("bwm");
                }else if(score >80 && score <= 99){
                    System.out.println("bs");
                }else if (score > 60 && score<=80){
                    System.out.println("Ad");
                }else {
                    System.out.println("无");
                }
            }
        }
