class Window4 extends Thread{
    static Object  obj = new Object();
    private static int i = 100;
    @Override
    public void run() {
        while (true){
            show();
        }
    }
    private static synchronized void show(){
        if (i > 0) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName() + ":" + i);
            i--;
        }
    }
}

public class WindowTest4 {
    public static void main(String[] args) {
        Window4 w1 = new Window4();
        Window4 w2 = new Window4();
        Window4 w3 = new Window4();
        w1.start();
        w2.start();
        w3.start();

    }
}
