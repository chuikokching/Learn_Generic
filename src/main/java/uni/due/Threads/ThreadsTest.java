package uni.due.Threads;

class MyThread extends Thread
{
    public void run()
    {
        System.out.println(getName() + " is running!!!");
    }
}


public class ThreadsTest {
    public static void main(String[] args) {
        System.out.println("main111 thread is running!!!");
        MyThread my = new MyThread();
        my.start();
        System.out.println("main222 thread is running!!!");

    }
}
