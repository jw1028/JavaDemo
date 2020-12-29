import java.util.Arrays;
public class MyArrayList {
    private int[] array;
    private int size;
    public MyArrayList(){
        this.array=new int[5];
    }
    public MyArrayList(int capacity)
    {
        this.array=new int[capacity];
    }

    public boolean isFull()
    {
        if(this.size==this.array.length)
        {
            return true;
        }else{
            return false;
        }
    }
    //增容
    public void resize(){
        this.array= Arrays.copyOf(this.array,2*this.array.length);
    }
    // 打印顺序表
    public void display() {
        for(int i=0;i<this.size;i++)
        {
            System.out.print(this.array[i]+" ");
        }
        System.out.println();
    }
    public void backAdd(int data){
        if(isFull())
        {
            resize();
        }
        this.array[this.size]=data;
        this.size++;
    }
    public void frontadd(int data){
        if (isFull()) {

            resize();
        }
        for(int i=this.size-1;i>=0;i--)
        {
            this.array[i+1]=this.array[i];
        }
        this.array[0]=data;
        this.size++;
    }


    // 在 pos 位置新增元素
    public void add(int pos, int data) {
        if(isFull()) {
            resize();
        }
           if(pos<0||pos>this.size)
           {
               System.out.println("插入位置不合法!");
               return ;
           }

           for(int i=this.size-1;i>=pos;i--)
           {
               this.array[i+1]=this.array[i];
           }
               this.array[pos]=data;
               this.size++;

    }
    // 判定是否包含某个元素
    public boolean find(int value) {
        for(int i=0;i<this.size;i++)
        {
            if(this.array[i]==value)
            {
                System.out.println("有" +value+"这个元素");
                return true;
            }
        }
        System.out.println("没有这个元素");
        return false;
    }
    // 查找某个元素对应的位置
    public int searchPos(int value) {
        for(int i=0;i<this.size;i++)
        {
            if(this.array[i]==value)
            {
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPosValue(int pos) {
       if(pos<0||pos>=this.size)
       {
           return -1;
       }else{
           return this.array[pos];
       }

    }
    // 给 pos 位置的元素设为 value
    public void setPosValue(int pos, int value) {
        if(pos<0||pos>=this.size)
        {
            return ;
        }
            this.array[pos]=value;

    }
    //删除第一次出现的关键字key
    public void deleteKey(int key) {
       int index=searchPos(key);
     if(index==-1)
     {
         System.out.println("没找到，老铁");
         return ;
     }
     for(int i=index;i<this.size-1;i++)
     {
         this.array[i]=this.array[i+1];
     }
     this.size--;
    }
    // 获取顺序表长度
    public int getSize() {
        return this.size;
    }
    // 清空顺序表
    public void clear() {
        this.size=0;
    }

    public static void main(String[] args) {
        MyArrayList myArrayList=new MyArrayList();
        myArrayList.add(0,0);
        myArrayList.frontadd(6);
        myArrayList.backAdd(7);
        myArrayList.backAdd(8);
        myArrayList.backAdd(9);
        myArrayList.backAdd(10);
        myArrayList.find(3);
        int ret=myArrayList.searchPos(2);
        System.out.println("对应元素的位置为："+ret);
        /*myArrayList.clear();*/
        myArrayList.setPosValue(3,666);
        myArrayList.deleteKey(7);
        myArrayList.display();
        System.out.println("顺序表的长度为:"+myArrayList.getSize());
    }
}
