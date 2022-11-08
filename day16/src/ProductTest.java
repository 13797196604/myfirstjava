import java.util.concurrent.locks.ReentrantLock;

class Clerk{
    private ReentrantLock lock = new ReentrantLock();
    private int producetCount = 0;
    public void produceProduct() {
        try {
            lock.lock();
            if (producetCount < 20) {
                producetCount++;
                System.out.println(Thread.currentThread().getName() + ":开始生产第" + producetCount + "个产品");
          }
        }finally {
            lock.unlock();
        }
    }

    public void consumeProduct() {
        try{
            lock.lock();
            if (producetCount > 0){
                System.out.println(Thread.currentThread().getName() + ":开始卖出第" + producetCount + "个产品");
                producetCount--;
            }
        }finally{
            lock.unlock();
        }
    }
}

 class Producter implements Runnable{
    private Clerk clerk;
    public Producter(Clerk clerk){
        this.clerk = clerk;
    }
     @Override
     public void run() {
         System.out.println(Thread.currentThread().getName() + "生产者开始生产");
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
     }
 }

class Customer implements Runnable{
    private Clerk clerk;
    public Customer(Clerk clerk){
        this.clerk = clerk;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "消费者开始消费");
        while(true){
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}

public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();
        Producter p = new Producter(clerk);
        Customer c =  new Customer(clerk);
        Thread p1 = new Thread(p);
        p1.setName("生产者1");
        Thread c1 = new Thread(c);
        c1.setName("消费者1");
        Thread c2 = new Thread(c);
        c2.setName("消费者2");
        c2.start();
        p1.start();
        c1.start();
    }
}
