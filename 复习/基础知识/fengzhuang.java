package 基础知识;

/**
 * 封装
 */
class Person {
    private String name;//实例成员变量
    private int age;

    public void setName(String name){
        //name = name;//不能这样写
        this.name = name;//this引用，表示调用该方法的对象
    }
    public String getName(){
        return name;
    }

    public void show(){
        System.out.println("name: "+name+" age: "+age);
    }
}

public class fengzhuang {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("caocao");
        String name = person.getName();
        person.show();
    }
}
