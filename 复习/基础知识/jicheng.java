package 基础知识;

/**
 * 继承
 */
class Animal{
    public  String name;
    private int age;
    public Animal(){
        System.out.println("Animal 的构造方法");
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
    public Dog(){
        //super();
        //默认构造Animal的无参构造super（）可以省略
    }
    public Dog(String name,int age)
    {
        //显示调用有参构造
        super(name,age);
    }
}
class Bird extends Animal{
    //默认构造Animal的无参构造
    public void fly() {
        System.out.println("鸟飞");
    }
}


public class jicheng {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog  dog = new Dog("旺财",16);
        System.out.println(dog.name);
        //age为private修饰，所以无法访问到
//        System.out.println(dog.age);

        Bird bird = new Bird();
    }

}
