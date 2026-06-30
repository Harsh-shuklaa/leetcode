class Solution {
    public int maxSubArray(int[] nums) {
        int bestEnding = nums[0];
        int ans = nums[0];
        for(int i = 1; i<nums.length;i++){
            int option1 = bestEnding+nums[i];
            int option2 = nums[i];
            bestEnding= Math.max(option1,option2);
            ans=Math.max(bestEnding,ans);
        }
        return ans;
    }
}