
class BinarySearchTree {

    static class BSNode {
        public int val;
        public BSNode left;
        public BSNode right;

        public BSNode(int val) {
            this.val = val;
        }
    }

    public BSNode root = null;

    public BSNode search(int val) {
        if (root == null) return null;
        BSNode cur = root;
        while (cur != null) {
            if (cur.val == val) {
                return cur;
            } else if (cur.val < val) {
                cur = cur.right;
            } else {
                cur = cur.left;
            }
        }
        return null;
    }

    public boolean insert(int val) {
        BSNode bsNode = new BSNode(val);
        if (root == null) {
            root = bsNode;
            return true;
        }
        BSNode cur = root;
        BSNode parent = null;

        while (cur != null) {
            if (cur.val == val) {
                return false;
            } else if (cur.val < val) {
                parent = cur;
                cur = cur.right;
            } else {
                parent = cur;
                cur = cur.left;
            }
        }
        //
        if (parent.val < val) {
            parent.right = bsNode;
        } else {
            parent.left = bsNode;
        }
        return true;
    }

    public void remove(int val) {
        if(root == null) return;
        BSNode cur = root;
        BSNode parent = null;
        while (cur != null) {
            if(cur.val == val) {
                removeNode(parent,cur,val);
                return;
            }else if(cur.val < val) {
                parent = cur;
                cur = cur.right;
            }else {
                parent = cur;
                cur = cur.left;
            }
        }
        System.out.println("没有这个节点");
    }

    /**
     * 删除二叉搜索树的节点 覆盖法
     * @param parent
     * @param cur
     * @param val
     */
    public void removeNode(BSNode parent,BSNode cur,int val) {
        if(cur.left == null) {
            if(cur == root) {
                root = cur.right;
            }else if(parent.left == cur) {
                parent.left = cur.right;
            }else {
                parent.right = cur.right;
            }
        }else if(cur.right == null) {
            if(cur == root) {
                root = cur.left;
            }else if(parent.left == cur) {
                parent.left = cur.left;
            }else {
                parent.right = cur.left;
            }
        }else {
            //
            BSNode targetParent = cur;
            BSNode target = cur.right;
            while (target.left != null) {
                targetParent = target;
                target = target.left;
            }
            //target指向的节点就是 右边的最小值
            cur.val = target.val;
            if(target == targetParent.left) {
                targetParent.left = target.right;
            }else {
                targetParent.right = target.right;
            }
        }
    }
}