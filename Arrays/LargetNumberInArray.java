public class LargetNumberInArray {
    public static void main(String[] args) {
        int arr[] = {1,2,32,45,21,564,323};

        int maxIndex = findLargest(arr);
        System.out.println("Largest element in the array:"+arr[maxIndex]+" at index:"+maxIndex);

        int minIndex = findSmallest(arr);
        System.out.println("Smallest element in the array:"+arr[minIndex]+" at index:"+minIndex);
    }
    static int findLargest(int arr[]){
        int maxi = -1;
        int maxElement = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            if(arr[i] > maxElement){
                maxi = i;
                maxElement = arr[i];
            }
        }
        return maxi;
    }
    static int findSmallest(int arr[]){
        int mini = -1;
        int minElement = Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i] < minElement){
                mini = i;
                minElement = arr[i];
            }
        }
        return mini;
    }
}
