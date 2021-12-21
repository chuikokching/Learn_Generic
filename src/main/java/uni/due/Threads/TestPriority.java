package uni.due.Threads;

class MyThread4 extends Thread
{
    private String name;
    public MyThread4(String name) {
        this.name=name;
    }

    public void run()
    {
        for(int i=1;i<=10;i++)
            System.out.println(name+ " is running!!! "+i );
    }
}
public class TestPriority {
    public static void main(String[] args) {


        int prior = Thread.currentThread().getPriority(); //主线程优先级 默认5
        System.out.println(prior);

        MyThread4 m4= new MyThread4("Mythread1");
        MyThread4 m3 =new MyThread4("Mythread2");

        //优先级高不一定先运行,受各种其他条件影响
        m3.setPriority(Thread.MIN_PRIORITY);//1
        m4.setPriority(Thread.MAX_PRIORITY);//10
        m3.start();
        m4.start();

    }
}
