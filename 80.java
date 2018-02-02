class Solution {
    public int removeDuplicates(int[] nums) {
        int index = 0;
        int count =0;
        for(int i =0; i< nums.length; i++){
            if(i > 0 && nums[i] == nums[i-1] && count == 1) continue;
            else if(i > 0 && nums[i] == nums[i-1]){
                count++;
                nums[index++] = nums[i];
            }else{
                nums[index++] = nums[i];
                count =0;
            
            }
    }
        return index;
    }
}