class Solution {
    public int firstMissingPositive(int[] nums) {
        int start = segregate(nums);
        for(int i =start; i < nums.length; i++){
            int index = Math.abs(nums[i]) + start -1;
            if(index < nums.length){
                nums[index] = -Math.abs(nums[index]);
            }
        }
        for(int i = start; i < nums.length; i++){
            if(nums[i] > 0){
                return i - start +1;
            }
        }
        return nums.length - start +1;
    }
    
    public int segregate(int[] nums){
        int start =0; 
        int end = nums.length-1;
        while(start <= end){
            if(nums[start] <=0)start++;
            else if(nums[end] >0)end--;
            else swap(nums,start,end);
        }
        return start;
    }
    public void swap(int[] nums, int start, int end)
    {
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}