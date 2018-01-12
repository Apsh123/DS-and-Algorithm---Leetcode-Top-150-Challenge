class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        
        int min = nums[0] + nums[1] + nums[nums.length -1];
        for(int i =0; i < nums.length-2; i++){
            if(i==0 || i > 0 && nums[i] != nums[i-1]){
                int lo = i+1; int hi = nums.length -1; 
                while(lo < hi){
                    int res = nums[i] + nums[lo] + nums[hi];
                    if( res > target) hi--;
                    else lo++;
                    if(Math.abs(res - target) < Math.abs(min-target)){
                        min = res;
                    }
                }
            }
        }
        return min;
    }
}