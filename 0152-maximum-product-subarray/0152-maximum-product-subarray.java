class Solution {
    public int maxProduct(int[] nums) {
         int res = nums[0];
         int minEnding = nums[0];
         int maxEnding = nums[0];

         for(int i = 1; i<nums.length;i++){
            int option1 = nums[i];
            int option2 = maxEnding*nums[i];
            int option3 = minEnding*nums[i];

            maxEnding = Math.max(option1, Math.max(option2,option3));
            minEnding = Math.min(option1, Math.min(option2,option3));
            

            res = Math.max(res,Math.max(maxEnding,minEnding));

           

         }
         return res;
    }
}