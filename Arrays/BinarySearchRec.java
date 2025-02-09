import java.util.Scanner;

public class BinarySearchRec {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6,7,8};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the target value to be searched:");
        int target = sc.nextInt();

        int index = binarySearchRec(arr,0,arr.length-1,target);

        if(index == -1){
            System.out.println("Element:"+target+" not present in the array");
        } else{
            System.out.println("Element:"+target+" is present in the array at index:"+index);
        }

        sc.close();
    }

    static int binarySearchRec(int arr[],int start, int end, int target){
        if(start > end){
            return -1;
        }

        int mid = (start+end)/2;

        if(arr[mid] == target){
            return mid;
        }

        if(arr[mid] > target){
            return binarySearchRec(arr, start, mid-1, target);
        }

        return binarySearchRec(arr, mid+1, end, target);
    }
}
