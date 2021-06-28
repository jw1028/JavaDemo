package 多线程;

import java.util.concurrent.locks.LockSupport;
/**
 * 唤醒特定的线程
 */
public class LockSupportTest {
    public static void main(String[] args) throws InterruptedException {



        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                LockSupport.park();
                System.out.println("唤醒t1");
            }
        }, "t1");


        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 让线程进行休眠
                LockSupport.park();
                System.out.println("唤醒 t2");
            }
        }, "t2");

        Thread t3 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 让线程进行休眠
                LockSupport.park();
                System.out.println("唤醒 t3");
            }
        }, "t3");

        t1.start();
        t2.start();
        t3.start();

        LockSupport.unpark(t3);
    }
}
