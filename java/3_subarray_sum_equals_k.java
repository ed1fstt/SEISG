public class Solution {
    public int subarraySum(int[] nums, int k) {
    int result = 0;
    //brute force solution
//        for (int i = 0; i < nums.length; i++ ) {
//            for (int j = i + 1; j<=nums.length; j++) {
//                int tempSum = 0;
//                for (int z = i; z < j; z++) {
//                    tempSum += nums[z];
//                }
//                    if (tempSum == k) {
//                        result++;
//                    }
//                }
//            }
      //
        //cummulative sum solution
//        int[] sum = new int[nums.length+1];
//        sum[0] = 0;
//        for (int i = 1; i <= nums.length; i++) {
//            sum[i] = sum[i - 1] + nums[i - 1];
//        }
//        for (int start = 0; start < nums.length; start++) {
//            for (int end = start + 1; end <= nums.length; end++) {
//                if (sum[end] - sum[start] == k){
//                    result++;
//                }
//            }
//        }
        //without space solution
        for (int start = 0; start < nums.length; start++) {
            int sum = 0;
            for (int end = start; end < nums.length; end++) {
                sum+=nums[end];
                if (sum == k) {
                    result++;
                }
            }
        }
        
    return  result;
    }
}
