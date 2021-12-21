package uni.due.Threads;

class MyThread3 extends Thread
{

    public MyThread3(String name) {
        super(name);
    }

    public void run()
    {
        for(int i=1;i<=10;i++)
        System.out.println(getName()+ " is running!!! "+i );
    }
}

public class TestJoin {
    public static void main(String[] args) {
        MyThread3 m3 = new MyThread3("Thread1");
        m3.start();
        try {
            m3.join(); //抢占资源
            //m3.join(1); //只抢占1毫秒
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        for(int i=1;i<=10;i++)
        System.out.println("Main is running!!! " +i );
    }
}
