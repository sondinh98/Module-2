public class BinarySearchTree {
    private Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int key) {
        root = insertNode(root, key);
    }

    private Node insertNode(Node root, int key) {
        if (root == null) {
            root = new Node(key);
            return root;
        }

        if (key < root.getKey()) {
            root.setLeft(insertNode(root.getLeft(), key));
        } else if (key > root.getKey()) {
            root.setRight(insertNode(root.getRight(), key));
        }

        return root;
    }

    public void postOrderTraversal() {
        postOrderTraversal(root);
    }

    private void postOrderTraversal(Node node) {
        if (node != null) {
            postOrderTraversal(node.getLeft());
            postOrderTraversal(node.getRight());
            System.out.print(node.getKey() + " ");
        }
    }
}