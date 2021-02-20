//快排
class Solution {
       public  void topKSort(int arr[], int k) {
        int length = arr.length;
        int left = 0, right = length - 1;
        int p = 0;
        while (k != p) {
            p = partition(arr, left, right);
            if (k < p) {
                right = p - 1;
            } else if (k > p) {
                left = p + 1;
            }
        }
        quickSort(arr, 0, k - 1);
        return ;
    }
    public  void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int piv = partition(arr, low, high);
            quickSort(arr, low, piv - 1);
            quickSort(arr, low + 1, high);
        }

    }
    public  int partition(int[] array, int low, int high) {
        int tmp = array[low];
        while (low < high) {
            while (array[high] >= tmp && low < high) {
                high--;
            }
            array[low] = array[high];
            while (array[low] <= tmp && low < high) {
                low++;
            }
            array[high] = array[low];
        }
        array[low] = tmp;
        return low;
    }
    public int[] getLeastNumbers(int[] arr, int k) {
        if(k>=arr.length) return arr;
        topKSort(arr,k);
        return Arrays.copyOf(arr,k);
    }
}
//堆
class Solution {
    public int[] getLeastNumbers(int[] arr, int k) {
    int[] ans=new int[k];
    if(arr==null||arr.length==0) return ans;
    PriorityQueue<Integer> maxHeap=new PriorityQueue<>((o1,o2)->o2-o1);
    for(int i=0;i<arr.length;i++)
    {
        if(maxHeap.size()<k)
        {
            maxHeap.offer(arr[i]);
        }else{
            Integer top=maxHeap.peek();
            if(top!=null){
              if(arr[i]<maxHeap.peek())
            {
                maxHeap.poll();
                maxHeap.offer(arr[i]);
            }
            }
        }
    }
    for(int i=0;i<k;i++)
    {
        ans[i]=maxHeap.poll();
    }
    return ans;
    }
}