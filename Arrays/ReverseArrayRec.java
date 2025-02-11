public class ReverseArrayRec {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5};
        System.out.print("Original Array:");
        printArray(arr);
        System.out.println();

        reverseArrayRec(arr,0,arr.length-1);

        System.out.print("Reversed Array:");
        printArray(arr);
        System.out.println();
    }

    static void reverseArrayRec(int arr[], int start, int end){
        if(start >= end){
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseArrayRec(arr, start+1, end-1);
    }
    static void printArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
