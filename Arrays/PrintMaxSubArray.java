public class PrintMaxSubArray {
    public static void main(String[] args) {
        int nums[] = {-2, 3, -5, 2, 7, 4};

        int startIdx =0, endIdx=0;
        int maxi = Integer.MIN_VALUE;
        int sum =0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            if(sum >= maxi){
                maxi = sum;
                endIdx = i;
            }
            if(sum < 0){
                sum = 0;
                startIdx = i+1;
            }
        }
        // if(endIdx == 0){
        //     endIdx = nums.length-1;
        // }

        System.out.println("startIdx: "+ startIdx+ ", endIdx: "+endIdx);
    }
}
