public class Test100 {

    int i = 1;

    public static void main(String[] args) {
        Test100 object = new Test100();
        Runnable runnable = new Runnable () {
            @Override
            public void run() {
                while(object.i < 100) {
                    synchronized (this) {
                        notify();
                        System.out.println(Thread.currentThread().getName() + " " + object.i++);
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                        try {
                            wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        };
    // 创建变量
//    int i = 1;
//
//    public static void main(String[] args) {
//        // 创建该类的对象
//        Test100 obj = new Test100();
//        // 使用匿名内部类的形式，没创建runnable对象
//        Runnable runnable = new Runnable() {
//            @Override
//            public void run() {
//                while (obj.i < 100) {
//                    // 上锁当前对象
//                    synchronized (this) {
//                        // 唤醒另一个线程
//                        notify();
//                        System.out.println("Thread " + Thread.currentThread().getName() + " " + obj.i++);
//                        try {
//                            Thread.currentThread();
//                            // 使其休眠100毫秒，放大线程差异
//                            Thread.sleep(100);
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                        try {
//                            // 释放掉锁
//                            wait();
//                        } catch (InterruptedException e) {
//                            e.printStackTrace();
//                        }
//                    }
//                }
//            }
//        };

//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(5, 10, 60 , TimeUnit.SECONDS,
//                new LinkedBlockingQueue<>(),
//                new ThreadPoolExecutor.DiscardPolicy());
//        for(int i = 0; i < 3; i++) {
//            threadPoolExecutor.execute(new Thread(runnable));
//        }

        // 启动多个线程（想创建几个就创建几个）
        Thread t1 = new Thread(runnable, "t1");
        t1.start();
        Thread t2 = new Thread(runnable,"t2");
        t2.start();
        Thread t3 = new Thread(runnable,"t3");
        t3.start();
//        new Thread(runnable).start();
//        new Thread(runnable).start();
//        new Thread(runnable).start();
    }
}
