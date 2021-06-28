package 多线程;

/**
 * 单例模式
 */

/**
 * 饿汉模式
 */
//public class Singleton {
//    private static Singleton singleton = new Singleton();
//    private Singleton(){}
//    public static Singleton getInstance() {
//        return singleton;
//    }
//
//}


/**
 * 饿汉模式
 */
//public class Singleton{
//    private static volatile Singleton  singleton = null;
//    private Singleton(){}
//    public static Singleton getInstance() {
//        if(singleton == null) {
//            synchronized(Singleton.class) {
//                if(singleton == null) {
//                    singleton = new Singleton;
//                }
//            }
//        }
//        return singleton;
//    }
//}

/**
 * 静态内部类实现
 */

//public class Singleton {
//    private Singleton(){
//
//    }
//    private static class InnerSingleton{
//        private static final Singleton singleton = new Singleton();
//    }
//    public static Singleton getInstance() {
//        return InnerSingleton.singleton;
//    }
//}

/**
 * 枚举实现
 */
public enum Singleton {
    singleton;
    public Singleton getSingleton() {
        return singleton;
    }
}