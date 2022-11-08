public class ExerDemo0804 {
    public static void main(String[] args) {
        Student[] stus = new Student[20];
        for (int i =0;i< stus.length;i++){
            stus[i]=new Student();
            stus[i].number = i + 1;
            // 年级[1,6]
            stus[i].state = (int) (Math.random()*(6-1+1)+1);
            //成绩[1,100]
            stus[i].score = (int) (Math.random()*(100-0+1)+1);
        }
        //学生数组遍历
        for (int i = 0;i< stus.length;i++){
            System.out.println(stus[i]);//显示的为20个地址
            System.out.println(stus[i].info());
        }
        System.out.println();
        for (int i = 0;i< stus.length;i++){
            if (stus[i].state==3){
                System.out.println(stus[i].info());
            }
        }
        System.out.println();
        for (int i = 0;i< stus.length-1;i++){
            for (int j =0;j< stus.length-1-i;j++){
            if (stus[j].score>stus[j+1].score) {
                Student temp = stus[j];
                stus[j]= stus[j + 1];
                stus[j + 1] = temp;
                }
            }
        }
        for (int i =0;i< stus.length;i++){
            System.out.println(stus[i].info());
        }
    }
}
class Student{
    // 属性
    int number;// 学号
    int state;// 年级
    int score;//成绩
    //方法
    public String info(){
       return "学号:"+number+",年级"+state+",成绩"+score;
    }
}
