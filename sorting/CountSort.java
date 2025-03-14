public class CountSort {
    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        System.out.print("Array before sorting:");
        printArr(arr);
        countingSort(arr);
        System.out.print("Array after sorting:");
        printArr(arr);
    }

    static void countingSort(int arr[]){
        int maxi = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            maxi = Math.max(arr[i], maxi);
        }

        int count[] = new int[maxi+1];

        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        //System.out.print("count arr:");
        //printArr(count);
        int j=0;
        for(int i=1;i<count.length;i++){
            while(count[i] > 0){
                arr[j]= i;
                count[i]--;
                j++;
            }
        }
    }
    static void printArr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}
