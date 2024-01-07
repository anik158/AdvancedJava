package binarytree;

public class Node<T extends Comparable<T>> {
    public T data;
    public Node<T> right;
    public Node<T> left;

    public Node( T data){
        this.data = data;
        this.right = null;
        this.left = null;
    }

    public Node(){
        this.right = null;
        this.left = null;
    }

    public T getData(){
        return this.data;
    }
}
