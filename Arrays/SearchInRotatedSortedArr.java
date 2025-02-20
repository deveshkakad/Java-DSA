public class SearchInRotatedSortedArr {
    public static void main(String[] args) {
        int arr[] = {4,5,6,7,0,1,2};
        int target = 11;

        System.out.println(searchInRotatedArr(arr, target));
    }

    static int searchInRotatedArr(int arr[], int target) {
        int start = 0, end = arr.length-1;

        while(start <= end) {
            int mid = (start + end)/2;

            if(arr[mid] == target) {
                return mid;
            }else if((arr[start] <= target && target < arr[mid])){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
}
