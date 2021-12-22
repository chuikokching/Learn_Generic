package uni.due.Threads.Notification;

public class Producer implements Runnable{

    Queue queue;

    public Producer(Queue queue) {
        this.queue = queue;
    }

    public void run() {
        int i =1;
        while(true)
        {
            queue.setN(i++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
