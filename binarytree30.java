/*class BNode {
    int data;
    BNode left;
    BNode right;
}
class BinaryTree {
    BNode root;

    void treeImplementation() {
        BNode node1=new BNode();
        node1.data=10;
        BNode node2=new BNode();
        node2.data=20;
        BNode node3=new BNode();
        node3.data=30;
        BNode node4=new BNode();
        node4.data = 40;
        BNode node5 = new BNode();
        node5.data = 50;
        root = node1;
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node5;
    }

    void inorder(BNode node) {
        if (node == null) {
            return;
        }
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }

    void preorder(BNode node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }

    void postorder(BNode node) {
        if (node == null) {
            return;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
}
    public class binarytree30 {
        public static void main(String[] args) {
            BinaryTree obj = new BinaryTree();
            obj.treeImplementation();
            System.out.println("INORDER TRAVERSAL");
            obj.inorder(obj.root);
            System.out.println();
            System.out.println("PREORDER TRAVERSAL");
            obj.preorder(obj.root);
            System.out.println();
            System.out.println("POSTORDER TRAVERSAL");
            obj.postorder(obj.root);
        }
    }*/
