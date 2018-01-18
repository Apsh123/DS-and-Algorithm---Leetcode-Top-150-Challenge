class Solution {
    public int trap(int[] height) {
        
        int[] maxSeenRight = new int[height.length];
        int maxSeenLeft = 0; int maxSeenSoFar =0; int res =0;
        
        for(int i = height.length-1; i>=0; i--){
           if(height[i] > maxSeenSoFar){
               maxSeenSoFar = height[i];
               maxSeenRight[i] = maxSeenSoFar;
           }else{
               maxSeenRight[i] = maxSeenSoFar;
           }
        }
        
        for(int i =0; i < height.length; i++){
            res += Integer.max(Integer.min(maxSeenLeft,maxSeenRight[i])-height[i],0);
            if(maxSeenLeft < height[i]){
                maxSeenLeft = height[i];
            }
        }
            return res;    
        }
        
    }
