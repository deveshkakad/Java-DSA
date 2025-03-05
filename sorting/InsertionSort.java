public class InsertionSort {
    public static void main(String[] args) {
        int arr[] = {2,1,45,32,5,212};
        insertionSort(arr);

        printArr(arr);
    }
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
    static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int curr = arr[i];
            int j= i-1;
            while(j >=0 && arr[j] > curr){
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = curr;
        }
    }
}
