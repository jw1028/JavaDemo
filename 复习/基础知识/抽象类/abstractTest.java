package 基础知识.抽象类;

/**
 * 抽象类
 */
abstract class abstractTest {
    public abstractTest() {
        this.num = 2;
    }
    public int num ;
    public static int func(int n) {
        return n;
    }
    abstract public void draw();
}


