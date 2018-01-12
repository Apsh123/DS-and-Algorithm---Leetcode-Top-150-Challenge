class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
     
        Arrays.sort(nums);
        List<List<Integer>>  res = new LinkedList<>();
        
       
        
        for(int i =0; i < nums.length-1 ;i ++){
            for(int j =i+1; j < nums.length-2 ; j++){
                if(i==0 || i>0 && nums[i] != nums[i-1]){
                if( j == i+1 || j >i+1 && nums[j] != nums[j-1]) {
                    int lo = j+1;  int hi = nums.length -1; int sum = target - (nums[i] + nums[j]);
                    while(lo < hi){
                             if(nums[lo] + nums[hi] == sum) {
                                 res.add(Arrays.asList(nums[i], nums[j], nums[lo], nums[hi]));
                                 while( lo< hi && nums[lo]==nums[lo+1]) lo++;
                                 while(lo<hi && nums[hi] ==nums[hi-1])hi--;
                                 lo++; hi--;
                             }else if(nums[lo] + nums[hi] < sum) lo++;
                            else hi--;
                        }
                    }
                }
            }
            }
        return res;
        }
    }
