public class MaxSumOfSubArray {
    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};

        //int maxSum = bruteForceMaxSumOfSubArr(arr);
        int maxSum = prefixSumOfSubArr(arr);

        System.out.println("Maximum sum of the subarray:"+maxSum);
    }

    static int prefixSumOfSubArr(int arr[]) {
        int maxSum = 0;
        int prefixSum[] = new int[arr.length];

        for(int i=0;i<arr.length;i++){
            prefixSum[i] = i == 0 ? arr[i] : prefixSum[i-1]+arr[i];
        }

        for(int i=0;i<arr.length;i++){
            int start = i;
            for(int j=i+1;j<arr.length;j++){
                int end = j;

                int currSum = start == 0 ? prefixSum[end] : prefixSum[end] - prefixSum[start-1];

                maxSum = Math.max(maxSum, currSum);
            }
        }
        return maxSum;
    }
    static int bruteForceMaxSumOfSubArr(int arr[]){

        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<arr.length;i++){
            int sum = arr[i];
            maxSum = Math.max(maxSum, sum);
            for(int j=i+1;j<arr.length;j++){
                sum = 0;
                for(int start=i;start<=j;start++){
                    sum += arr[start];
                }
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }
}
