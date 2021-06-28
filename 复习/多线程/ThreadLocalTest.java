package 多线程;

/**
 * ThreadLocal线程本地变量
 */
public class ThreadLocalTest {

        private static ThreadLocal<String> threadLocal = new ThreadLocal<>();
        public static void main(String[] args) {
            //线程执行任务
            Runnable runnable = new Runnable() {
                @Override
                public void run() {
                    String threadName = Thread.currentThread().getName();
                    System.out.println(threadName + "存入值" + threadName);
                    //在ThreadLocal中设置值
                    threadLocal.set(threadName);
                    //执行方法,打印线程中设置的值
                    print(threadName);
                }
            };
            //创建并启动线程1
            new Thread(runnable, "MyThread-1").start();
            //创建并启动线程2
            new Thread(runnable, "MyThread-2").start();
        }
        /**
         * 打印线程中ThreadLocal值
         */
        private static void print(String threadName) {
            try{
                //得到ThreadLocal中得值
                String result = threadLocal.get();
                //打印结果
                System.out.println(threadName + "取出值" + result);

            }finally {
                //移除ThreadLocal中得值
                threadLocal.remove();
            }
        }
    }

//    static ThreadLocal<String> threadLocal = new ThreadLocal<>();
//    static class MyThreadLocal {
////        private static boolean flag = false;
//        public void show() {
//            String tname = Thread.currentThread().getName();
////            if (!flag) {
//                // 第一次执行
//                threadLocal.set(tname);
//                System.out.println(tname + " 设置了：" + tname);
////                flag = true;
////            }
//            System.out.println(tname + "得到了：" + threadLocal.get());
//            System.out.println();
//        }
//    }
//    public static void main(String[] args) {
//        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(
//                5,10,60, TimeUnit.SECONDS,
//                new LinkedBlockingQueue<>(),
//                new ThreadPoolExecutor.DiscardPolicy()
//        );
//        for(int i = 0; i < 10; i++) {
//            threadPoolExecutor.execute(new Runnable() {
//                @Override
//                public void run() {
//                    MyThreadLocal myThreadLocal = new MyThreadLocal();
//                    myThreadLocal.show();
//                }
//            });
//        }
//
////        Thread t1 = new Thread(new Runnable() {
////            @Override
////            public void run() {
////                MyThreadLocal myThreadLocal = new MyThreadLocal();
////                myThreadLocal.show();
////            }
////        }, "线程1");
////        t1.start();
////
////        Thread t2 = new Thread(new Runnable() {
////            @Override
////            public void run() {
////                MyThreadLocal myThreadLocal = new MyThreadLocal();
////                myThreadLocal.show();
////            }
////        }, "线程2");
////        t2.start();
////
//    }
//}
