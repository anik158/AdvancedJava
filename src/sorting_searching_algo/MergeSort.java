package sorting_searching_algo;

public class MergeSort {

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

        mergeSort(data);

        System.out.println("\nAfter sorting:");
        for (int i = 0; i < sz; i++) {
            System.out.print(data[i]+" ");
        }
    }

    private static void mergeSort(int[] data) {

        int length = data.length;

        if(length<2){
            return;
        }

        int midIndex = length/2;

        int[] leftHalf = new int[midIndex];
        int[] rightHalf = new int[length-midIndex];

        for (int i = 0; i < midIndex; i++) {
            leftHalf[i] = data[i];
        }

        for (int i = midIndex; i < data.length; i++) {
            rightHalf[i-midIndex] = data[i];
        }

        mergeSort(leftHalf);
        mergeSort(rightHalf);

        merge(data,leftHalf,rightHalf);
    }

    private static void merge(int[] data, int[] leftHalf, int[] rightHalf) {

        int leftSize = leftHalf.length;
        int rightSize = rightHalf.length;
        int i = 0, j =0, k=0;

        while (i<leftSize && j<rightSize){

            if(leftHalf[i]<rightHalf[j]){
                data[k] = leftHalf[i];
                i++;
            }else {
                data[k] = rightHalf[j];
                j++;
            }
            k++;
        }

        while(i<leftSize){
            data[k] = leftHalf[i];
            i++;
            k++;
        }

        while (j<rightSize){
            data[k] = rightHalf[j];
            j++;
            k++;
        }
    }
}
