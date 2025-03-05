public class SelectionSort {
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

    static void insertionSort(int arr[]) {
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}
