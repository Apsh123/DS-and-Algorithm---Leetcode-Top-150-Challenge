class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> list = new ArrayList<>();
        backtrack(list, new ArrayList<>(), candidates, target, 0);
        return list;
        
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int target, int start){
        if(target < 0) return;
        else if (target == 0){
            list.add(new ArrayList<>(tempList));
        }
        else{
            for(int i =start ; i<nums.length && nums[i] <= target; i++){
                if(i > start && nums[i] == nums[i-1])continue;
                tempList.add(nums[i]);
                backtrack(list, tempList, nums, target-nums[i], i+1);
                tempList.remove(tempList.size() -1);
            }
        }
    }
}