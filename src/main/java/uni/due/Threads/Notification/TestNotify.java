package uni.due.Threads.Notification;

public class TestNotify {

    /*
    * 线程之间的通信
    *
    * */

    public static void main(String[] args) {
        System.out.println("Hello World!!!!!!");
        Queue queue = new Queue();
        new Thread(new Producer(queue)).start();
        new Thread(new Consumer(queue)).start();


    }
}
