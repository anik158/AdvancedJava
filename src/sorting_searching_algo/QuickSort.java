package sorting_searching_algo;




public class QuickSort {
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

        quickSort(data,0,data.length-1);

        System.out.println("\nAfter Sorting: ");
        for (int i = 0; i < sz; i++) {
            System.out.print(data[i]+" ");
        }

    }

    private static void quickSort(int[] data, int lowIndex, int highIndex) {

       if(lowIndex>=highIndex){
           return;
       }

       int pivot = data[highIndex];
       int rightPointer = highIndex;
       int leftPointer =  lowIndex;

       while(leftPointer<rightPointer){

           while(data[leftPointer]<=pivot && leftPointer < rightPointer){
               leftPointer++;
           }

           while(data[rightPointer]>=pivot && leftPointer<rightPointer){
               rightPointer--;
           }

           swap(data,leftPointer,rightPointer);
       }

       swap(data,leftPointer,highIndex);

       quickSort(data,lowIndex, leftPointer-1);
       quickSort(data,leftPointer+1, highIndex);
    }

    private static void swap(int[] data, int index1, int index2) {


            int temp = data[index1];
            data[index1] = data[index2];
            data[index2] = temp;

    }
}
