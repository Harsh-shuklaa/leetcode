class Solution {
    public int minSubArrayLen(int target, int[] nums) {
         int low = 0;
         int high = 0 ;
         int sum= 0;
         int result = Integer.MAX_VALUE;
          
          while(high<nums.length){
              sum = sum +nums[high];
             while(sum>=target){
                int length = high-low+1;
                result = Math.min(result,length);
                sum = sum-nums[low];
                low++;
             }
             high++;
          }
          return (result == Integer.MAX_VALUE) ? 0:result;
             
    }
}