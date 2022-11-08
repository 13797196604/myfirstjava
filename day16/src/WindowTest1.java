class Window1 implements Runnable{
    Object obj = new Object();
    private int i = 100;
    @Override
    public void run() {
        while(true){
            //synchronized (obj) {
            synchronized (this) {
                if (i > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                       e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + i);
                    i--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest1 {
    public static void main(String[] args) {
        Window1 w = new Window1();
        Thread t1 =new Thread(w);
        Thread t2 =new Thread(w);
        Thread t3 =new Thread(w);
        t1.start();
        t2.start();
        t3.start();

    }
}
