class HelloWorld {
    public static void main(String[] args) {

        // 变量保存成绩
        int score = 30;

        // 变量保存加分次数
        int count = 0;


        //打印输出加分前成绩

        System.out.println("加分前成绩"+score);

        // 只要成绩小于60，就循环执行加分操作，并统计加分次数


        for(score=30;score<60;score++){
            count++;

        }
        //打印输出加分后成绩，以及加分次数
        System.out.println("加分后成绩"+score);
        System.out.println("共加了"+count+"次!");


    }
}