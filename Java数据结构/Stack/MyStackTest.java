
public class MyStackTest {
    public static void main(String[] args) {
        MyStack myStack=new MyStack(5);
        System.out.println(myStack.empty());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(6);
        System.out.println(myStack.peek());
        System.out.println(myStack.size());
        myStack.list();
        myStack.empty();
    }
}
