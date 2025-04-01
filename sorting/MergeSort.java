public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {6,3,9,5,2,8,-2};
        mergeSort(arr,0,arr.length-1);
        printArr(arr);
    }

    static void mergeSort(int arr[], int start, int end){
        if(start >= end){
            return;
        }

        int mid = start + (end-start)/2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid+1, end);

        merge(arr,start,mid,end);
    }

    static void merge(int arr[], int start, int mid, int end){
        int temp[] = new int[end - start + 1];
        int i = start;
        int j= mid+1;
        int k=0;

        while(i<= mid && j<=end){
            if(arr[i] < arr[j]){
                temp[k] = arr[i];
                i++;
            }else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        while(i<=mid){
            temp[k++] = arr[i++];
        }

        while(j<=end){
            temp[k++] = arr[j++];
        }

        k = start;
        for(i=0;i<temp.length;i++){
            arr[k] = temp[i];
            k++;
        }
    }
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
