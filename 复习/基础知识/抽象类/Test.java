package 基础知识.抽象类;


public class Test extends abstractTest{
    @Override
    public void draw() {
        System.out.println("♣");
    }

    public static void main(String[] args) {
        Test test = new Test();
        test.draw();
        System.out.println(test.num);
        System.out.println(test.func(5));
    }
}
