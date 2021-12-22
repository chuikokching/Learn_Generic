package uni.due.Threads.Notification;

public class Queue {
    private int n;
    public boolean flag = false;

    public synchronized int getN() {

        if(!flag)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Get: "+n +" "+flag);
        flag=false;
        notifyAll();
        return n;
    }

    public synchronized void setN(int n) {

        if(flag)
        {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Set: "+n+" "+flag);
        this.n = n;
        flag=true;
        notifyAll();

    }


}
