import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value to be searched:");
        int target = sc.nextInt();

        int index = binarySearch(arr, target);
        if(index == -1){
            System.out.println("Element:"+target+" not present in the array");
        } else{
            System.out.println("Element:"+target+" is present in the array at index:"+index);
        }

        sc.close();
    }

    static int binarySearch(int arr[], int target){
        int start =0;
        int end = arr.length-1;

        while(start <= end){
            int mid = (start+end)/2;

            if(arr[mid] == target){
                return mid;
            }else if(arr[mid] > target){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return -1;
    }
}
