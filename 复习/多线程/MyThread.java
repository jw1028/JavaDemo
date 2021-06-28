package 多线程;

/**
 * 线程的创建
 */
public class MyThread extends Thread{
    @Override
    public void run() {
        System.out.println("子线程" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        System.out.println("主线程" + Thread.currentThread().getName());
    }
}
