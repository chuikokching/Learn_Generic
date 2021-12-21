package uni.due.Threads;

class MyThread2 extends Thread
{

    public MyThread2(String name) {
        super(name);
    }

    public void run()
    {
        for(int i=1;i<=10;i++)
        System.out.println(getName()+ " " + i + " is running!!!");
    }
}


public class ThreadsTest2 {

    public static void main(String[] args) {
        //获取CPU使用权是随机的
        MyThread2 mt1=new MyThread2("Thread1");
        MyThread2 mt2=new MyThread2("Thread2");
        mt1.start();
        mt2.start();
    }

}
