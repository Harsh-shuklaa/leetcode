class Solution {
    public int longestOnes(int[] nums, int k) {
         int low = 0;
         int  res = 0;
         int zeroes =0;
         
         for(int high = 0 ; high<nums.length;high++){
            // high ko include kro information me 
          if(nums[high]==0){
            zeroes++;
          }
           // jab tk information galat h tba tak lowko bdhana h 
            while(zeroes > k) {
                     if(nums[low] == 0){
                     zeroes--;
            }
            low++;
            }  
              int  len = high-low+1;
            res=Math.max(len,res);
         }
         return res;
    }
}