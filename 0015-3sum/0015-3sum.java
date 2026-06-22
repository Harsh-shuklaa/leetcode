class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>>result = new ArrayList<>();

        Arrays.sort(nums);

        for(int i = 0; i<nums.length-2;i++){

          if(i > 0 && nums[i]==nums[i-1]){
            continue;
          }
            
          //apply 2-sum for each nums[i]
            int left= i+1;
            int right = nums.length-1;

            while(left < right){
                int sum =nums[left]+nums[right];
                int target= -1*nums[i];

                //case 1: sum == target 
                if(sum==target){
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    left++;
                    right--;
 
                    while( left<nums.length && nums[left]==nums[left-1]){
                        left++;
                    }
                    while( right< 0 && nums[right]==nums[right+1]){
                        right--;
                    }
                }
                 //case 2: sum > target 
                  else if( sum>target){
                    right--;
                 }
                 //case 3: sum < target 
                 else{
                    left++;
                 }
                
            }
        }
        return result;
       
    }
}