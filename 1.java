public class Solution {
    public int[] twoSum(int[] nums, int target) {
        
         if(nums.length>=2)
        {
            HashMap<Integer,Integer> h = new HashMap<Integer,Integer>();
            for(int i=0; i<nums.length; i++){
                if(!h.isEmpty() && h.containsKey(target-nums[i]))
                {
                    int[] k = {h.get(target-nums[i]),i};
                    return k;
                }
                
                h.put(nums[i],i);
            }
        }
        
        int[] k = {-1,-1};
        return k;
    }
}