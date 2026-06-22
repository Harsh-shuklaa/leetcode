class Solution {
    public void sortColors(int[] nums ) {
        // dutch national flag algorithm
      int low = 0, mid=0,high=nums.length-1;
    while(mid<=high){
        //case:1
        if(nums[mid]==0){
            //swap
            int temp = nums[mid];
            nums[mid]=nums[low];
            nums[low]=temp;

            low++;
            mid++;
        }
        //case:2
        else if(nums[mid]==1){
            mid++;
        }
        //case:3
        else if(nums[mid]==2){
            //swap
            int temp = nums[mid];
            nums[mid]=nums[high];
            nums[high]=temp;
            high--;
            
        }
    }
      
    }
}