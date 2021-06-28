package 基础知识.多态;

/**
 * 运行时绑定
 */

class Animal{
    public  String name;
    private int age;
    public Animal(){
    }
    public Animal(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void eat(){
        System.out.println("动物吃");
    }
}
class Dog extends Animal {
    public  int leg;
    public Dog(){
        //super();
        //默认构造Animal的无参构造super（）可以省略
    }
    public Dog(String name,int age)
    {
        //显示调用有参构造
        super(name,age);
    }
    public void eat(){
        System.out.println("狗吃");
    }
    public void wangwang(){
        System.out.println("汪汪叫！");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal animal1=new Dog();
        Animal animal2=new Animal();
        animal1.eat();
        animal2.eat();
    }
}
