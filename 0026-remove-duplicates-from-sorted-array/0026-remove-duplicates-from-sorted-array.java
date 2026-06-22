class Solution {
    public int removeDuplicates(int[] nums) {
        int unique = 1;
        int i = 0;
        int j = i+1;

        while(j<nums.length){
            if(nums[j]==nums[i]){
                j++;
              continue;
            }

            if(nums[j]>nums[i]){
               //swap
                int temp = nums[j];
                nums[j] = nums[i+1];
                nums[i+1] = temp;
                i++;
                j++;
                unique=unique+1;
            }
            
        }
        return unique;
     
    }
}