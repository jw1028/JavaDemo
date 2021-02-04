
public class Test {
    public static void preOrder(BinarySearchTree.BSNode root) {
        if(root == null) {
            return;
        }
        System.out.print(root.val+" ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(BinarySearchTree.BSNode root) {
        if(root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.val+" ");
        inOrder(root.right);
    }

    public static void main(String[] args) {
        BinarySearchTree binarySearchTree = new BinarySearchTree();
        binarySearchTree.insert(4);
        binarySearchTree.insert(3);
        binarySearchTree.insert(1);
        binarySearchTree.insert(15);
        binarySearchTree.insert(11);

        preOrder(binarySearchTree.root);
        System.out.println();
        inOrder(binarySearchTree.root);
        System.out.println();

        try {
            BinarySearchTree.BSNode ret = binarySearchTree.search(4);
            System.out.println(ret.val);
        }catch (NullPointerException e) {
            System.out.println("没有找到当前的节点............");
            e.printStackTrace();
        }

        binarySearchTree.remove(66);
        preOrder(binarySearchTree.root);
        System.out.println();
        inOrder(binarySearchTree.root);
        System.out.println();

    }
}
