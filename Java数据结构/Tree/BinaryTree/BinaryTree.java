
public class BinaryTree {
  
    public BTNode createTree() {
        BTNode A = new BTNode('A');
        BTNode B = new BTNode('B');
        BTNode C = new BTNode('C');
        BTNode D = new BTNode('D');
        BTNode E = new BTNode('E');
        BTNode F = new BTNode('F');
        BTNode G = new BTNode('G');
        BTNode H = new BTNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        /*E.right = H;*/
        C.left = F;
        C.right = G;
        return A;
    }
    //前序遍历创建二叉树
    public  int i=0;
    public  BTNode createTree2(String str){
        if(str==null) return null;
        BTNode root=null;
        if(str.charAt(i)!='#')
        {
            root=new BTNode(str.charAt(i));
            i++;
            root.left=createTree2(str);
            root.right=createTree2(str);

        }else{
            i++;
        }
        return root;
    }

    // 前序遍历 递归实现
    void preOrderTraversal(BTNode root) {
        if(root == null) return;
        System.out.print(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }



    // 中序遍历 递归实现
    void inOrderTraversal(BTNode root) {
        if(root==null) return ;
        inOrderTraversal(root.left);
        System.out.print(root.val);
        inOrderTraversal(root.right);
    }

    // 后序遍历 递归实现
    void postOrderTraversal(BTNode root) {
       if(root==null) return ;
       postOrderTraversal(root.left);
       postOrderTraversal(root.right);
        System.out.print(root.val);
    }

    // 前序遍历 非递归实现
    void preOrderTraversalNor(BTNode root)
    {
        if(root==null) return ;
        Stack<BTNode> stack=new Stack<>();
        BTNode cur=root;
        while(cur!=null||!stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.val);
                cur = cur.left;
            }
            BTNode top = stack.pop();
            cur = top.right;
        }
        System.out.println();
    }

    // 中序遍历 非递归实现
    void inOrderTraversalNor(BTNode root){
        if(root==null) return ;
        BTNode cur=root;
        Stack<BTNode> stack=new Stack<>();
        while(cur!=null||!stack.isEmpty())
        {
            while(cur!=null)
            {
                stack.push(cur);
                cur=cur.left;
            }
            BTNode top=stack.pop();
            System.out.print(top.val);
            cur=top.right;
        }
        System.out.println();
    }

    // 后序遍历 非递归实现
    void postOrderTraversalNor(BTNode root){
        if(root==null) return ;
        BTNode cur=root;
        BTNode prev=null;
        Stack<BTNode> stack=new Stack<>();
        while(cur!=null||!stack.isEmpty())
        {
            while(cur!=null)
            {
                stack.push(cur);
                cur=cur.left;
            }
            BTNode top=stack.peek();
            if(top.right==null||top.right==prev)
            {
                stack.pop();
                System.out.print(top.val);
                prev=top;

            }else{
                cur=top.right;
            }
        }
        System.out.println();
    }

    // 层序遍历 借助队列
    void levelOrderTraversal(BTNode root) {
        if(root == null) return;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            BTNode cur = queue.poll();
            System.out.print(cur.val );
            if(cur.left != null) {
                queue.offer(cur.left);
            }
            if(cur.right != null){
                queue.offer(cur.right);
            }
        }
        System.out.println();
    }

    // 求结点个数 遍历思路
    static int size = 0;
    void getSize1(BTNode root){
        if(root==null)
        {
            return ;
        }
        int count=0;
        if(root==null) return  ;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        size++;
        System.out.println();
    }

    // 求结点个数 子问题思路
    int getSize2(BTNode root){
        if(root==null) return -1;
        return 1+getSize2(root.right)+getSize2(root.left);
    }

    // 求叶子结点个数 遍历思路
    static int leafSize = 0;
    void getLeafSize1(BTNode root){
        if(root==null) return ;

        if(root.right==null&&root.left==null)
        {
            leafSize++;
        }
        getLeafSize1(root.left);
        getLeafSize1((root.right));
    }

    // 求叶子结点个数 子问题思路
    int getLeafSize2(BTNode root){
        if(root==null) return 0;
        if(root.right==null&&root.left==null)
        {
            return 1;
        }
        return getLeafSize2(root.right)+getLeafSize2(root.left);
   }

    // 求第 k 层结点个数 子问题思路
    int getKLevelSize(BTNode root,int k) {
        if(root == null) {
            return 0;
        }
        if(k == 1) {
            return 1;
        }
        return getKLevelSize(root.left,k-1)+
                getKLevelSize(root.right,k-1);
    }

    // 获取二叉树的高度
    int getHeight(BTNode root) {
        if(root == null) return 0;

        return getHeight(root.left) > getHeight(root.right) ?
                getHeight(root.left)+1 : getHeight(root.right)+1;
    }

    // 查找 val 所在结点，没有找到返回 null
    // 按照 根 -> 左子树 -> 右子树的顺序进行查找
    // 一旦找到，立即返回，不需要继续在其他位置查找
       BTNode find(BTNode root, char val){
        if(root==null) return null;
        if(root.val==val)
        {
            return  root;
        }
        BTNode ret=find(root.left,val);
        if(ret!=null) return ret;
        ret=find(root.right,val);
        if(ret!=null) return ret;
        return null;
       }

    // 判断一棵树是不是完全二叉树 借助栈实现
    boolean isCompleteTree(BTNode root) {
        if(root==null) return false;
        Queue<BTNode> list=new LinkedList<>();
        list.offer(root);
        while(!list.isEmpty())
        {
            BTNode cur=list.poll();
            if(cur!=null){
                list.offer(cur.left);
                list.offer(cur.right);
            }else{
                break;
            }
        }
       for(BTNode i:list)
       {
           if(i!=null)
           {
               return  false;
           }
       }
       return true;
    }    
}



