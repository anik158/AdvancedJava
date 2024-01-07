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



    public void inOrder(){
        inOrder(root);
    }

    private void inOrder(Node<T> n){

        if(n==null){
           return;
        }
        inOrder(n.left);
        System.out.print(n.getData()+" ");
        inOrder(n.right);
    }

    public void preOrder(){
        preOrder(root);
    }

    private void preOrder(Node<T> n){

        if(n==null){
           return;
        }

        System.out.print(n.getData()+" ");
        preOrder(n.left);
        preOrder(n.right);
    }

    public T min(){
        Node<T> current = root;

        while (current.left!=null){
            current = current.left;
        }

        return current.getData();
    }

    public T max(){
        Node<T> current = root;

        while(current.right!=null){
            current = current.right;
        }
        return current.getData();
    }
}
