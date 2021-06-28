package 多线程;


public class ThreadWaitTest {
    public static void main(String[] args) throws InterruptedException {
        Object lock = new Object();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                // 注意事项：调用 wait 方法之前必须先加锁
                synchronized (lock) {
                    try {
                        System.out.println("wait 之前");
                        lock.wait(2);
                        System.out.println("wait 之后");
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }, "t1");
        t1.start();

        Thread.sleep(5000);
        System.out.println("主线程唤醒t1");
        // 在主线程中唤醒线程 t1
        synchronized (lock) {
//            lock.notify();
            lock.notifyAll();
        }
    }
}
