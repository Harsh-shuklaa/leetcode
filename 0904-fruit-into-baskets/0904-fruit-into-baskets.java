class Solution {
    public int totalFruit(int[] fruits) {
         int low = 0;
         int high = 0;
         Map<Integer,Integer>freq = new HashMap<>();
         int result = Integer.MIN_VALUE;

         for(high = 0; high<fruits.length;high++){
            // high ko include kro information me 
            freq.put(fruits[high],freq.getOrDefault(fruits[high],0)+1);

            while(freq.size()>2){
            freq.put(fruits[low], freq.get(fruits[low])-1);
               if(freq.get(fruits[low]) == 0 ){
                 freq.remove(fruits[low]);
               }
               low++;
            }

            if(freq.size() <= 2){
                 int length = high-low +1;
                 result = Math.max(result,length);
            }
               
         }
         return (result == Integer.MIN_VALUE)? 1 : result;
    }
}