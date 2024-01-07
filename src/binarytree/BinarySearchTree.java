package binarytree;

public class BinarySearchTree<T extends Comparable<T>> {
    public Node<T> root;
    public BinarySearchTree(){
        this.root = null;
    }



public void insert(T data){
        Node<T> newNode = new Node<>();
        newNode.data = data;

        if(root==null){
            root = newNode;
        }else{
            Node<T> current = root;
            Node<T> parent;

            while(true){
                parent = current;

                if(data.compareTo(current.data)<0){
                    current = current.left;

                    if(current==null){
                        parent.left = newNode;
                        return;
                    }
                }else{
                    current = current.right;
                    if(current==null){
                        parent.right = newNode;
                        return;
                    }
                }
            }
        }
}

    public void displayInOrder(Node<T> node) {

        if (node == null) {
            return;
        }

        displayInOrder(node.left);
        System.out.print(node.data + " ");
        displayInOrder(node.right);
    }



}
