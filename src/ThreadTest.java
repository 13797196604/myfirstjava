class MyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){
                System.out.println(Thread.currentThread().getName() + ":" +i);
            }
        }
    }
}
class MyyThread extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            if (i % 2 != 0){
                System.out.println(Thread.currentThread().getName() + ":" +i);
            }
        }
    }
}

public class ThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread();
        MyyThread t2 = new MyyThread();
        t2.setPriority(10);
        t1.start();
        t2.start();
        System.out.println(Thread.currentThread().getName() + ":" +"hello");
        System.out.println(t1.getPriority());
    }
}
