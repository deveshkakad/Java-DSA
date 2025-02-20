public class DistinctElementInArr {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4};

        System.out.println(isDistictElementInArray(arr));
    }

    static boolean isDistictElementInArray(int arr[]) {
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    return false;
                }
            }
        }
        return true;
    }
}
