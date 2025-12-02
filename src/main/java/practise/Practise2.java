package practise;


public class Practise2 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 1, 3, 4};
        mergeSort(arr,0,arr.length-1);
        printArray(arr);
    }

    public static void mergeSort(int[] arr, int low, int high){
        if(low >= high) return;
        int mid = (low + high)/2;
        mergeSort(arr,low,mid);
        mergeSort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }

    public static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int index = 0;
        int[] temp = new int[high - low + 1];

        // compare and merge
        while(left <= mid && right <= high) {
            if(arr[left] < arr[right]) {
                temp[index++] = arr[left++];
            } else {
                temp[index++] = arr[right++];
            }
        }

        while(left <= mid)    temp[index++] = arr[left++];
        while(right <= high)  temp[index++] = arr[right++];

        // copy back
        for(int i = low; i <= high; i++) {
            arr[i] = temp[i - low];
        }
    }

    public static void  printArray(int[] arr){
        for(int num : arr){
            System.out.print(num+" ");
        }
    }
}
