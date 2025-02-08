import java.util.Scanner;

public class LinearSearch{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = {1,32,34,56,42,321,123};
        System.out.print("Enter the elemet to be search in the array:");
        int target  = sc.nextInt();

        int index = linearSearch(arr,target);
        if(index == -1){
            System.out.println("Elemet "+target+" not found in the array");
        }else {
            System.out.println("Element:"+ target+" found at index:"+index+" in the array");
        }
        sc.close();
    }
    static int linearSearch(int arr[], int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == target){
                return i;
            }
        }
        return -1;
    }
}