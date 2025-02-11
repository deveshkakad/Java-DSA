public class SubArrays {
    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};

        printSubArray(arr);
    }

    static void printSubArray(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
            for(int j=i+1;j<arr.length;j++){
                for(int start = i;start <=j; start++){
                    System.out.print(arr[start]+" ");
                }
                System.out.println();
            }
        }
    }
}
