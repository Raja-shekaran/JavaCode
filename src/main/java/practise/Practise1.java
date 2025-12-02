package practise;


public class Practise1 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 1, 3, 4};
        quickSort(arr,0,arr.length-1);
        printArray(arr);
    }

    public static void quickSort(int[] arr, int low, int high){
       if(low < high){
           int partitionIndex = getPartitionIndex(arr,low,high);
           quickSort(arr,low,partitionIndex - 1);
           quickSort(arr,partitionIndex + 1,high);
       }
    }

    public static int getPartitionIndex(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i < j){
            while(arr[i] <= pivot && i < high){
                i++;
            }
            while(arr[j] > pivot && j > low){
                j--;
            }
            if(i < j){
                int t = arr[i];
                arr[i] = arr[j];
                arr[j] = t;
            }
        }

        int t = arr[low];
        arr[low] = arr[j];
        arr[j] = t;

        return j;
    }



    public static void  printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
