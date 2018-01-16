class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int[] res = {-1,-1};
        if(nums.length == 0) return res;
        int i =0; int j= nums.length-1;
        
        while(i < j){
            int mid = (i + j)/2;
            if(nums[mid] < target) i= mid+1;
            else j = mid;
        }
        if(nums[i] != target) res[0] = -1;
        else res[0] = i;
        
        j = nums.length-1;
        while (i < j){
            int mid =(i + j +1)/2;
            if(nums[mid] > target) j = mid-1;
            else i = mid;
        }
         if(nums[j] != target) res[1] = -1;
        else res[1] = j;
        
        return res;
    }
}