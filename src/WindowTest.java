class Window extends Thread{
    private static int i = 100;
    @Override
    public void run() {
        while (true){
            if (i > 0){
                System.out.println(getName() + ":" + i);
                i--;
            }else{
                break;
            }
        }
    }
}

public class WindowTest {
    public static void main(String[] args) {
        Window w1 = new Window();
        Window w2 = new Window();
        Window w3 = new Window();
        w1.start();
        w2.start();
        w3.start();

    }
}
