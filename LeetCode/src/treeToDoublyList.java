class Solution {
    public Node prev=null;
    public  void inOrder(Node cur)
    {
        if(cur==null) return ;
            inOrder(cur.left);
            cur.left=prev;
            if(prev!=null)
            {
                prev.right=cur;
            }
            prev=cur;
            inOrder(cur.right);
        }
    
    public Node treeToDoublyList(Node root) {
        if(root==null) return null;
        inOrder(root);
        Node head=root;
        Node tail=root;
        while(head.left!=null)
        {
            head=head.left;
        }
        while(tail.right!=null)
        {
            tail=tail.right;
        }
        head.left=tail;
        tail.right=head;
        return head;
    }
}