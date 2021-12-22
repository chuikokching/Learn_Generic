package uni.due.Threads.Synchronization;

public class TestSynchronized {
    /*
    * 进程同步问题
    *
    * 用synchronized关键字修饰函数,或者加入synchronized(this){}块
    * 保证代码执行完成前不会被打断,保证业务流程完整
    * 避免多线程造成的读写冲突, 因为存款或者取款操作执行一半时可能被打断
    * 导致结果没有回写,而其他线程已经获取原来的值开始工作.
    *
    * 被synchronized关键字修饰的函数或者代码块无法被打断其CPU的使用权,直到执行完成再释放.
    *
    * */

    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
