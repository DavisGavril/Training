class BST {
    static class BSTNode {
        int data;
        BSTNode left, right;
        BSTNode(int data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
    BSTNode root;
    BST() {
        root = null;
    }
    public BSTNode insert(BSTNode node, int value) {
        if (node == null) {
            return new BSTNode(value);
        }
        if (value < node.data) {
            node.left = insert(node.left, value);
        } else if (value > node.data) {
            node.right = insert(node.right, value);
        }
        return node;
    }
    public void inorder(BSTNode node) {
        if (node == null) return;
        inorder(node.left);
        System.out.print(node.data + " ");
        inorder(node.right);
    }
    public void preorder(BSTNode node) {
        if (node == null) return;
        System.out.print(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    public void postorder(BSTNode node) {
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.data + " ");
    }
    public int height(BSTNode node) {
        if (node == null) return 0;
        int leftHeight = height(node.left);
        int rightHeight = height(node.right);
        return 1 + Math.max(leftHeight, rightHeight);
    }
    public int findMin(BSTNode node) {
        if (node == null) throw new RuntimeException("Tree is empty");
        while (node.left != null) node = node.left;
        return node.data;
    }
    public int findMax(BSTNode node) {
        if (node == null) throw new RuntimeException("Tree is empty");
        while (node.right != null) node = node.right;
        return node.data;
    }
    public BSTNode delete(BSTNode root, int key) {
        if (root == null) return null;
        if (key < root.data) {
            root.left = delete(root.left, key);
        } else if (key > root.data) {
            root.right = delete(root.right, key);
        } else {
            if (root.left == null) return root.right;
            else if (root.right == null) return root.left;
            root.data = findMin(root.right);
            root.right = delete(root.right, root.data);
        }
        return root;
    }
}
public class binarysearchtree31 {
    public static void main(String[] args) {
        BST tree = new BST();
        tree.root = tree.insert(tree.root, 10);
        tree.root = tree.insert(tree.root, 20);
        tree.root = tree.insert(tree.root, 5);
        tree.root = tree.insert(tree.root, 15);
        tree.root = tree.insert(tree.root, 30);
        System.out.println("Inorder (sorted):");
        tree.inorder(tree.root);
        System.out.println("\nPreorder:");
        tree.preorder(tree.root);
        System.out.println("\nPostorder:");
        tree.postorder(tree.root);
        System.out.println("\nHeight: " + tree.height(tree.root));
        System.out.println("Min: " + tree.findMin(tree.root));
        System.out.println("Max: " + tree.findMax(tree.root));
        tree.root = tree.delete(tree.root, 20);
        System.out.println("\nInorder after deleting 20:");
        tree.inorder(tree.root);
    }
}
