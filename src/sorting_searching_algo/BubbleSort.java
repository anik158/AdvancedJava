package sorting_searching_algo;

public class BubbleSort {

    public static void main(String[] args) {

        int sz = 10;

        int[] data =new int[sz];

        for (int i = 0; i < sz; i++) {
            data[i] = (int)(Math.random()*100);
        }

        System.out.println("Before sorting:");
        for (int i = 0; i < sz; i++) {
            System.out.print(data[i]+" ");
        }

        bubbleSort(data);
    }

    public static void bubbleSort(int[] arr){

        int size = arr.length;
        for (int i = 1; i < size; i++) {
            for (int j = 0; j < size-i ; j++) {
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
