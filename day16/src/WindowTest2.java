import java.awt.*;

class Window2 extends Thread{
    static Object  obj = new Object();
    private static int i = 100;
    @Override
    public void run() {
        while (true){
            //synchronized (obj) {
            //synchronized (this) {
            synchronized (Window2.class) {
                if (i > 0) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(getName() + ":" + i);
                    i--;
                } else {
                    break;
                }
            }
        }
    }
}

public class WindowTest2 {
    public static void main(String[] args) {
        Window2 w1 = new Window2();
        Window2 w2 = new Window2();
        Window2 w3 = new Window2();
        w1.start();
        w2.start();
        w3.start();

    }
}
