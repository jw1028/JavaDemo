import java.util.HashMap;
import java.util.Objects;


public class Test {
    public static void main(String[] args) {
        HashTable1 hb = new HashTable1();
        hb.push(1, 1);
        hb.push(2, 2);
        hb.push(10, 10);
        hb.push(4, 4);
        hb.push(5, 5);
        hb.push(6, 6);//这个元素放完后就要扩容了
        hb.push(7, 7);
        System.out.println(hb.get(6));

        HashTable2 hashTable2=new HashTable2();
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        HashTable2<Person, String> hashBuck2 = new HashTable2<>();
        hashTable2.push(person1, "zjc");
        hashTable2.push(person2, "wangfei");
        System.out.println(hashTable2.get(person1));
    }

}
