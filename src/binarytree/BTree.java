package binarytree;

public class BTree {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);
        bst.insert(12);
        bst.insert(18);

        System.out.println("Inorder Printing: ");
        bst.inOrder();
        System.out.println("\nPre-order Printing: ");
        bst.preOrder();
        System.out.println("\nMax:"+ bst.max());
        System.out.println("Min:"+bst.min());
    }
}
