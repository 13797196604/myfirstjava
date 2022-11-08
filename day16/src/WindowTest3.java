class Window3 implements Runnable{
    Object obj = new Object();
    private int i = 100;
    @Override
    public void run() {
        while (true) {
            show();
        }
    }
    private synchronized void show(){
        if (i > 0) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
            i--;
        }
    }
}


public class WindowTest3 {
    public static void main(String[] args) {
        Window3 w = new Window3();
        Thread t1 =new Thread(w);
        Thread t2 =new Thread(w);
        Thread t3 =new Thread(w);
        t1.start();
        t2.start();
        t3.start();

    }
}
