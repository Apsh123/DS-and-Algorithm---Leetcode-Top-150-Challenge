class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        //list.add(new ArrayList<Integer>());
        backtrack(list, new ArrayList<Integer>(), nums, 0);
        return list;
    }
    
    public void backtrack(List<List<Integer>> list, List<Integer> tempList, int[] nums, int start){
        
        list.add(new ArrayList<>(tempList));
        
        for(int i = start; i < nums.length; i++)
        {
            //if(tempList.contains(nums[i]))continue;
            tempList.add(nums[i]);
            backtrack(list, tempList, nums, i+1);
            tempList.remove(tempList.size()-1);
        }   
    }
}