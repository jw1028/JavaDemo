package 基础知识.多态;

public class duotai {
    public static void drawMap(Shape shape){
        shape.draw();
    }
    public static void main(String[] args) {
        Shape shape=new Shape();
        Rect rect=new Rect();
        Circle circle=new Circle();
        Flower flower=new Flower();
        drawMap(shape);
        drawMap(rect);
        drawMap(circle);
        drawMap(flower);
    }

}
