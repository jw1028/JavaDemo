import java.util.Arrays;

public class Heap {
    public int[] elem;
    public int usedSize;

    @Override
    public String toString() {
        return "Heap{" +
                "elem=" + Arrays.toString(elem) +
                ", usedSize=" + usedSize +
                '}';
    }

    public Heap() {
        this.elem = new int[10];
    }

    public void swap(int[] array,int a,int b)
    {
        int tmp=array[a];
        array[a]=array[b];
        array[b]=tmp;
    }
    public void adjustDown(int parent, int len) {
        int child = 2 * parent + 1;
        //child < len 说明有左孩子
        while (child < len) {
            //child+1 < len 判断是 当前是否  有右孩子
            if (child + 1 < len && this.elem[child] <this.elem[child + 1]) {
                child++;//
            }
            //child 下标 一定是 左右孩子的最大值下标
            if (this.elem[child] > this.elem[parent]) {
                swap(this.elem,child,parent);
                parent = child;
                child = 2 * parent + 1;
            } else {
                //因为是从最后一棵树开始调整的  只要我们 找到了这个
                // this.elem[child] <= this.elem[parent]   后续就不需要循环了
                //后面的都已经是大根堆了
                break;
            }
        }
    }
    public void adjustUp(int child){
         int parent=(child-1)/2;
         while(child>0)
         {
             if(this.elem[child]>this.elem[parent])
             {
                 swap(this.elem,child,parent);
                 child=parent;
                 parent=(child-1)/2;

             }else{
                 break;
             }
         }
    }

    public void createBigHeap(int[] array) {
        for (int i = 0; i < array.length; i++) {
            this.elem[i] = array[i];
            this.usedSize++;
        }
        for (int i = (this.usedSize - 1 - 1) / 2; i >= 0; i--) {
            adjustDown(i, this.usedSize);
        }
    }

    public void show(){
        for(int i=0;i<this.usedSize;i++)
        {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    /**
     * 逻辑：放到数组的最后一个位置
     * 然后向上调整
     * @param val
     * @return
     */
    public  void offer(int val) {
        if(isFull())
        {
            this.elem=Arrays.copyOf(this.elem,2*this.elem.length);
        }
        this.elem[usedSize]=val;
        this.usedSize++;//加一
        adjustUp(usedSize-1);
    }

    /**
     * 第一个 和 最后一个换
     * 向下调整 0下标这棵树
     * @return
     */
    public int poll() {
      if(isEmpty())
      {
          throw new RuntimeException("队列为空");
      }
      int ret=this.elem[0];
      swap(this.elem,0,this.usedSize);
      this.usedSize--;
      adjustDown(0,this.usedSize);
      return  ret;
    }

    public int peek() {
        if(isEmpty())
        {
            throw new RuntimeException("队列为空");
        }
        return this.elem[0];
    }


    public boolean isEmpty()
    {
        return this.usedSize==0;
    }

    public boolean isFull() {
       return this.usedSize==this.elem.length;
    }
}
