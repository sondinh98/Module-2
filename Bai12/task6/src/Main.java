public class Main {
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();

        // Insert nodes
        tree.insert(27);
        tree.insert(14);
        tree.insert(35);
        tree.insert(10);
        tree.insert(19);
        tree.insert(31);
        tree.insert(42);

        // Print nodes in postorder
        System.out.print("Postorder traversal: ");
        tree.postOrderTraversal();
    }
}
