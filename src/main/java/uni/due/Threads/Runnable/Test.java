package uni.due.Threads.Runnable;

class PrintRunnable implements Runnable
{
    //run()方法可以被共享,适合多个线程处理同一个资源的场景
    int i =1;
    public void run() {
        while(i<=10)
        System.out.println(Thread.currentThread().getName() +" "+ (i++) + " is running!!!");
    }
}
public class Test {

    public static void main(String[] args) {
        PrintRunnable pr = new PrintRunnable();
        Thread t1= new Thread(pr);
        t1.start();

        //PrintRunnable pr2 = new PrintRunnable();
        Thread t2= new Thread(pr);
        t2.start();
    }
}
