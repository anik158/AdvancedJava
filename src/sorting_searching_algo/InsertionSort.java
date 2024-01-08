package sorting_searching_algo;

public class InsertionSort {
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

        insertionSort(data);
    }

    public static void insertionSort(int[] arr){

        for (int i = 0; i < arr.length; i++) {

            for (int j = i; j>0; j--) {

                if(arr[j-1]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
        }

        System.out.println("\nAfter sorting: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    } 
}
