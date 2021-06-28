package 基础知识.接口;

/**
 * 接口
 */
interface IShape {
    public static final int num = 10;
    void draw();
}

class Circle implements IShape {
    @Override
    public void draw() {
        System.out.println("○");
    }
}



public class interfaceTest {
    public static void main(String[] args) {
        IShape shape = new Circle();
        shape.draw();
//        num被final修饰不能修改
//        shape.num = 20;
        System.out.println(shape.num);
    }
}
