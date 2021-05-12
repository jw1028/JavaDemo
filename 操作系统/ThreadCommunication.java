//按顺序打印CBA
public class SequencePrint {
    private static class PrintTask implements Runnable{
        private String content;
        private Thread joinTask;
        public PrintTask(String content, Thread joinTask) {
            this.content = content;
            this.joinTask = joinTask;
        }
        @Override
        public void run() {

            try {
                if(joinTask != null)
                    joinTask.join();
                System.out.println(content);

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }
    public static void main(String[] args) {
        Thread c = new Thread(new PrintTask("C", null));
        Thread b = new Thread(new PrintTask("B", c));
        Thread a = new Thread(new PrintTask("A", b));
       a.start();
       b.start();
       c.start();

    }
  
  //按顺序打印ABC十次
  public class SequencePrint2 {
    public static void main(String[] args) {
        Thread a = new Thread(new Task("A"));
        Thread b = new Thread(new Task("B"));
        Thread c = new Thread(new Task("C"));
        c.start();
        b.start();
        a.start();
    }

    private static class Task implements Runnable {

        private String content;
        //顺序打印的内容：可以循环打印
        private static String[] ARR = {"A", "B", "C"};
        private static int INDEX;//从数组哪个索引打印

        public Task(String content) {
            this.content = content;
        }

        @Override
        public void run() {
            try {
                for (int i = 0; i < 10; i++) {
                    synchronized (ARR) {//三个线程使用同一把锁
                        //从数组索引位置打印，如果当前线程要打印的内容不一致，释放对象锁等待
                        while (!content.equals(ARR[INDEX])) {
                            ARR.wait();
                        }
                        //如果数组要打印的内容和当前线程要打印的一致，
                        // 就打印，并把数组索引切换到一个位置，通知其他线程
                        System.out.print(content);
                        if (INDEX == ARR.length - 1) {
                            System.out.println();
                        }
                        INDEX = (INDEX + 1) % ARR.length;
                        ARR.notifyAll();
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
