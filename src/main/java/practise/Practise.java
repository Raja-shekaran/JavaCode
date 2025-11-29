package practise;

public class Practise {
    public static void main(String[] args) {
        int[] arr = new int[]{64, 25, 12, 22, 11};
//        selectionSort(arr);
//        bubbleSort(arr);
//        optimizedBubbleSort(arr);
//        insertionSort(arr);
//        bubbleSortRecursive(arr,0);
        insertionSortRecursive(arr,arr.length);
        System.out.println("After Sorting");
        printArray(arr);
    }

    public static void selectionSort(int[] arr){
       for(int i=0;i<arr.length-1;i++)
       {
           int minIndex = i;
           for(int j=i+1;j<arr.length;j++)
           {
               if(arr[j] < arr[minIndex]){
                   minIndex = j;
               }
           }
           int temp = arr[minIndex];
           arr[minIndex] = arr[i];
           arr[i] = temp;
       }
    }

    //O(n2)
    public static void bubbleSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    //O(n)
    public static void optimizedBubbleSort(int[] arr){
        for(int i=0;i<arr.length-1;i++)
        {
            boolean swapped = false;
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int t = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = t;
                    swapped = true;
                }
            }
            if(!swapped){
               break;
            }
        }
    }

    public static void bubbleSortRecursive(int[] arr, int i){
        if(i==arr.length-1) return;
        for(int j=0;j<arr.length-i-1;j++){
            if(arr[j] > arr[j+1]){
                int t = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = t;
            }
        }
        bubbleSortRecursive(arr,i+1);
    }

    public static void insertionSortRecursive(int[] arr, int n)
    {
        if(n <= 1) return;
        insertionSortRecursive(arr,n-1);
        int key = arr[n-1];
        int j = n - 2;
        while(j>=0 && arr[j] > key){
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }


    public static void insertionSort(int[] arr) {
        //key
        //compare left
        //shift right
        //insert key
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            int j = i-1;
            while (j>=0 && arr[j] > key){
                arr[j+1] = arr[j];
                j--; // all elements so decrement
            }
            arr[j+1] = key;
        }
    }

    public static void printArray(int[] arr){
        for(int num : arr){
            System.out.println(num);
        }
    }
}
