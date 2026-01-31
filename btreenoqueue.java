class BinaryTree {
    static class TNode {
        int data;
        TNode left, right;
        TNode(int value) {
            data=value;
            left=null;
            right=null;
        }
    }
    TNode root;
    BinaryTree() {
        root=null;
    }
    public boolean isFull(TNode node) {
        if (node==null) return true; // empty subtree is full
        if (node.left==null && node.right==null) return true; // leaf is full
        if (node.left!=null && node.right!=null) {
            return isFull(node.left) && isFull(node.right);
        }
        return false;
    }
    public TNode insert(TNode node, int value) {
        if (node==null) {
            return new TNode(value);
        }
        if (node.left==null) {
            node.left=new TNode(value);
        } else if (node.right==null) {
            node.right=new TNode(value);
        } else {
            if (!isFull(node.left)) {
                node.left=insert(node.left, value);
            } else if (!isFull(node.right)) {
                node.right=insert(node.right, value);
            } else {
                node.left=insert(node.left, value);
            }
        }
        return node;
    }
    public void inorder(TNode node) {
        if (node==null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public void preorder(TNode node) {
        if (node==null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(TNode node) {
        if (node==null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    public int height(TNode node)
}
public class btreenoqueue {
    public static void main(String[] args) {
        BinaryTree obj=new BinaryTree();
        obj.root=obj.insert(obj.root, 10);
        obj.root=obj.insert(obj.root, 20);
        obj.root=obj.insert(obj.root, 5);
        obj.root=obj.insert(obj.root, 15);
        obj.root=obj.insert(obj.root, 30);

        System.out.println("Inorder:");
        obj.inorder(obj.root);

        System.out.println("\nPreorder:");
        obj.preorder(obj.root);

        System.out.println("\nPostorder:");
        obj.postorder(obj.root);
    }
}
